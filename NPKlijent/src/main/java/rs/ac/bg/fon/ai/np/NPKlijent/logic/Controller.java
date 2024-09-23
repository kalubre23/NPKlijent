/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.logic;

import java.net.Socket;
import java.util.List;

import rs.ac.bg.fon.ai.np.NPCommon.communication.Operation;
import rs.ac.bg.fon.ai.np.NPCommon.communication.Receiver;
import rs.ac.bg.fon.ai.np.NPCommon.communication.Request;
import rs.ac.bg.fon.ai.np.NPCommon.communication.Response;
import rs.ac.bg.fon.ai.np.NPCommon.communication.Sender;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Automobil;
import rs.ac.bg.fon.ai.np.NPCommon.domain.DeoAutomobila;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Marka;
import rs.ac.bg.fon.ai.np.NPCommon.domain.NalogZaServisiranje;
import rs.ac.bg.fon.ai.np.NPCommon.domain.PokvareniDeo;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Korisnik;
import rs.ac.bg.fon.ai.np.NPCommon.domain.Vlasnik;

/**
 * Predstavlja kontrolera koji povezuje GUI i server. Implementiran kao singleton patern.
 * 
 * GUI poziva njegove metode i prosledjuje mu podatke, zatim se oni pakuju u zahtev i salju
 * do servera. Takodje se ocekuje odgovor od servera koje se prosledjuje GUI-ju.
 *
 * @author Luka Obrenic
 * @since 1.0.0
 */
public class Controller {

    /**
     * Socket za komunikaciju sa serverom, tipa Socket.
     * @see Socket
     */
    Socket socket;
    /**
     * Posiljaoc zahteva do servera, tipa Sender.
     * @see Sender
     */
    Sender sender;
    /**
     * Primalac odgovora od servera, tipa Receiver.
     * @see Receiver
     */
    Receiver receiver;

    /**
     * Staticka instanca kontrolera za implementaciju singleton paterna.
     */
    private static Controller instance;

    /**
     * Privatni neparametrizovani konstruktor za inicijalizaciju objekta kontrolera.
     * @throws Exception ako dodje do greske pri inicijalizaciji socket-a, sender-a ili receiver-a
     */
    private Controller() throws Exception {
        socket = new Socket("localhost", 9000);
        sender = new Sender(socket);
        receiver = new Receiver(socket);
    }

    /**
     * Vraca jednu instancu kontrolera.
     * 
     * Ukoliko je null, prvo je inicijalizuje i onda vraca.
     * 
     * @return instance kontrolera, tipa Controller
     * @throws Exception ako dodje do greske pri inicijalizaciji kontrolera
     */
    public static Controller getInstance() throws Exception {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    /**
     * Salje zahtev serveru za logovanje korisnika i ceka odgovor. 
     * 
     * Vraca nazad inicijalizovanog korisnika ukoliko je login uspesan ili baca izuzetak 
     * ukoliko login nije uspesan.
     * 
     * @param korisnik koji se loguje, tipa {@link Korisnik}
     * @return korisnik koga je vratio server, login uspesan
     * @throws Exception ako je login neuspesan
     */
    public Korisnik login(Korisnik korisnik) throws Exception {
        Request request = new Request(Operation.LOGIN, korisnik);
        sender.send(request);

        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (Korisnik) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje zahtev serveru za listom svih marki automobila.
     * 
     * Vraca nazad listu marki ili baca izuzetak ako je doslo do greske na strani servera.
     * 
     * @return lista marki primljena od servera, kao lista tipa {@link Marka}
     * @throws Exception ako dodje do greske pri ucitavanju marki na strani servera
     */
    public List<Marka> ucitajListuMarki() throws Exception {
        Request request = new Request(Operation.UCITAJ_LISTU_MARKI, null);
        sender.send(request);

        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<Marka>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje zahtev serveru za cuvanjem automobila u bazi.
     * 
     * Prima odgovor i ukoliko se desila greska na serveru, vraca se izuzetak.
     * 
     * @param auto koga treba sacuvati u bazi, tipa {@link Automobil}
     * @throws Exception ako je doslo do greske na serveru
     */
    public void sacuvajAutomobil(Automobil auto) throws Exception {
        Request request = new Request(Operation.SACUVAJ_AUTOMOBIL, auto);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            //auto.setAutoID(((Automobil)response.getResult()).getAutoID());
            System.out.println("Uspesno sacuvan auto!");
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za automobile koji zadovoljavaju kriterijum pretrage.
     * 
     * Ako se nije desila greska na serveru vraca listu automobila, u suportnom vraca izuzetak.
     * 
     * @param auto koji ce se koristiti kao kriterijum pretrage u bazi, tipa {@link Automobil}
     * @return lista automobila koji zadovoljavaju kriterijum pretrage, kao lista tipa {@link Automobil}
     * @throws Exception ako dodje do greske na serveru
     */
    public List<Automobil> pronadjiAutomobile(Automobil auto) throws Exception {
        Request request = new Request(Operation.PRONADJI_AUTOMOBILE, auto);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<Automobil>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za izmenu podataka o automobilu u bazi.
     * 
     * Ako se desila greska pri izmeni podataka o automobilu na serveru, baca se izuzetak.
     * 
     * @param automobil sa novim (azuriranim vrednostima), tipa {@link Automobil}
     * @throws Exception ako dodje do greske na serverskoj strani
     */
    public void izmeniAutomobil(Automobil automobil) throws Exception {
        Request request = new Request(Operation.IZMENI_AUTOMOBIL, automobil);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za brisanjem automobila iz baze.
     * 
     * Ako se desila greska pri brisanju automobila na serveru, baca se izuzetak.
     * 
     * @param automobil koga treba izbrisati iz baze, tipa {@link Automobil}
     * @throws Exception ako se desila greska na serverskoj strani
     */
    public void obrisiAUtomobil(Automobil automobil) throws Exception {
        Request request = new Request(Operation.OBRISI_AUTOMOBIL, automobil);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }


    /**
     * Salje zahtev serveru za listom svih delova automobila.
     * 
     * Vraca nazad listu delova automobila ili baca izuzetak ako je doslo do greske na strani servera.
     * 
     * @return lista delova automobila primljena od servera, kao lista tipa {@link DeoAutomobila}
     * @throws Exception ako dodje do greske pri ucitavanju delova automobila na strani servera
     */
    public List<DeoAutomobila> ucitajListuDelovaAutomobila() throws Exception {
        Request request = new Request(Operation.UCITAJ_LISTU_DELOVA_AUTOMOBILA, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<DeoAutomobila>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje zahtev serveru za cuvanjem pokvarenog dela u bazi.
     * 
     * Prima odgovor i ukoliko se desila greska na serveru, baca se izuzetak.
     * 
     * @param pokvareniDeo koga treba sacuvati u bazi, tipa {@link PokvareniDeo}
     * @throws Exception ako je doslo do greske na serveru
     */
    public void sacuvajPokvareneDelove(List<PokvareniDeo> listaDelova) throws Exception {
        Request request = new Request(Operation.SACUVAJ_POKVAREN_DEO, listaDelova);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            //auto.setAutoID(((Automobil)response.getResult()).getAutoID());
            System.out.println("Uspesno sacuvan pokvareni deo!");
        } else {
            throw response.getException();
        }
    }


    /**
     * Salje serveru zahtev za pokvarenim delovima koji zadovoljavaju kriterijum pretrage.
     * 
     * Ako se nije desila greska na serveru vraca listu pokvarenih delova, u suportnom vraca izuzetak.
     * 
     * @param pd pokvareni deo koji ce se koristiti kao kriterijum pretrage u bazi, tipa {@link PokvareniDeo}
     * @return lista pokvarenih delova koji zadovoljavaju kriterijum pretrage, kao lista tipa {@link PokvareniDeo}
     * @throws Exception ako dodje do greske na serveru
     */
    public List<PokvareniDeo> pronadjiPokvareneDelove(PokvareniDeo pd) throws Exception {
        Request request = new Request(Operation.PRONADJI_POKVARENE_DELOVE, pd);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<PokvareniDeo>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za brisanjem pokvarenog dela iz baze.
     * 
     * Ako se desila greska pri brisanju pokvarenog dela na serveru, baca se izuzetak.
     * 
     * @param pokvareniDeo koga treba izbrisati iz baze, tipa {@link PokvareniDeo}
     * @throws Exception ako se desila greska na serverskoj strani
     */
    public void obrisiPokvarenDeo(PokvareniDeo pokvareniDeo) throws Exception {
        Request request = new Request(Operation.OBRISI_POKVAREN_DEO, pokvareniDeo);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za izmenu podataka o pokvarenom delu u bazi.
     * 
     * Ako se desila greska pri izmeni podataka o pokvarenom delu na serveru, baca se izuzetak.
     * 
     * @param pokvareniDeo sa novim (azuriranim vrednostima), tipa {@link PokvareniDeo}
     * @throws Exception ako dodje do greske na serverskoj strani
     */
    public void izmeniPokvareniDeo(PokvareniDeo pokvareniDeo) throws Exception {
        Request request = new Request(Operation.IZMENI_POKVAREN_DEO, pokvareniDeo);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    /**
     * Salje zahtev serveru za cuvanjem naloga za servisiranje u bazi.
     * 
     * Prima odgovor i ukoliko se desila greska na serveru, baca se izuzetak.
     * 
     * @param nalog koga treba sacuvati u bazi, tipa {@link NalogZaServisiranje}
     * @throws Exception ako je doslo do greske na serveru
     */
    public void zapamtiNalogZaServisiranje(NalogZaServisiranje nalog) throws Exception {
        Request request = new Request(Operation.SACUVAJ_NALOG_ZA_SERVISIRANJE, nalog);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            //auto.setAutoID(((Automobil)response.getResult()).getAutoID());
            System.out.println("Uspesno sacuvan pokvareni deo!");
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za nalozima koji zadovoljavaju kriterijum pretrage.
     * 
     * Ako se nije desila greska na serveru vraca listu naloga, u suportnom vraca izuzetak.
     * 
     * @param nalogZaServisiranje koji ce se koristiti kao kriterijum pretrage u bazi, tipa {@link NalogZaServisiranje}
     * @return lista naloga koji zadovoljavaju kriterijum pretrage, kao lista tipa {@link NalogZaServisiranje}
     * @throws Exception ako dodje do greske na serveru
     */
    public List<NalogZaServisiranje> pronadjiNalogeZaServisiranje(NalogZaServisiranje nalogZaServisiranje) throws Exception {
        Request request = new Request(Operation.PRONADJI_NALOGE_ZA_SERVISIRANJE, nalogZaServisiranje);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<NalogZaServisiranje>) response.getResult();
        } else {
            throw response.getException();
        }
    }


    /**
     * Salje serveru zahtev za brisanjem naloga iz baze.
     * 
     * Ako se desila greska pri brisanju naloga na serveru, baca se izuzetak.
     * 
     * @param nalog koga treba izbrisati iz baze, tipa {@link NalogZaServisiranje}
     * @throws Exception ako se desila greska na serverskoj strani
     */
    public void obrisiNalogZaServisiranje(NalogZaServisiranje nalog) throws Exception {
        Request request = new Request(Operation.OBRISI_NALOG_ZA_SERVISIRANJE, nalog);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za logout i zatvara socket za komunikaciju.
     * 
     * @param serviser koga treba izlogovati
     * @throws Exception ako se desi greska na strani servera
     */
    public void logout(Korisnik serviser) throws Exception {
        Request request = new Request(Operation.LOGOUT, serviser);
        sender.send(request);
        //zatvori socket
        if(!socket.isClosed() && socket != null){
            socket.close();
            System.out.println("Socket je zatvoren kod klijenta!");
        }
    }

    /**
     * Salje zahtev serveru za cuvanjem vlasnika u bazi.
     * 
     * Prima odgovor, i ukoliko se desila greska na serveru, baca se izuzetak.
     * 
     * @param vlasnik koga treba sacuvati u bazi, tipa {@link Vlasnik}
     * @throws Exception ako je doslo do greske na serveru
     */
    public void sacuvajVlasnika(Vlasnik vlasnik) throws Exception {
        Request request = new Request(Operation.SACUVAJ_VLASNIKA, vlasnik);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            System.out.println("Uspesno sacuvan vlasnik!");
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za brisanjem vlasnika iz baze.
     * 
     * Ako se desila greska pri brisanju vlasnika na serveru, baca se izuzetak.
     * 
     * @param vlasnik koga treba izbrisati iz baze, tipa {@link Vlasnik}
     * @throws Exception ako se desila greska na serverskoj strani
     */
    public void obrisiVlasnika(Vlasnik vlasnik) throws Exception {
        Request request = new Request(Operation.OBRISI_VLASNIKA, vlasnik);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za vlasnicima koji zadovoljavaju kriterijum pretrage.
     * 
     * Ako se nije desila greska na serveru vraca listu vlasnika, u suportnom vraca izuzetak.
     * 
     * @param vlasnik koji ce se koristiti kao kriterijum pretrage u bazi, tipa {@link Vlasnik}
     * @return lista vlasnika koji zadovoljavaju kriterijum pretrage, kao lista tipa {@link Vlasnik}
     * @throws Exception ako dodje do greske na serveru
     */
    public List<Vlasnik> pronadjiVlasnike(Vlasnik vlasnik) throws Exception {
        Request request = new Request(Operation.PRONADJI_VLASNIKE, vlasnik);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<Vlasnik>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za izmenu podataka o vlasniku u bazi.
     * 
     * Ako se desila greska pri izmeni podataka o vlasniku na serveru, baca se izuzetak.
     * 
     * @param vlasnik sa novim (azuriranim vrednostima), tipa {@link Vlasnik}
     * @throws Exception ako dodje do greske na serverskoj strani
     */
    public void izmeniVlasnika(Vlasnik vlasnik) throws Exception {
        Request request = new Request(Operation.IZMENI_VLASNIKA, vlasnik);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }


    /**
     * Salje serveru zahtev za svim serviserima iz baze.
     * 
     * Ako se desila greska pri vracanju svih servisera na serveru, baca se izuzetak.
     * 
     * @throws Exception ako dodje do greske na serverskoj strani
     */
    public List<Korisnik> vratiSveServisere() throws Exception {
        Request request = new Request(Operation.VRATI_SVE_SERVISERE, null);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (List<Korisnik>) response.getResult();
        } else {
            throw response.getException();
        }
    }

    /**
     * Salje serveru zahtev za izmenu podataka o nalogu u bazi.
     * 
     * Ako se desila greska pri izmeni podataka o nalogu na serveru, baca se izuzetak.
     * 
     * @param nalogIzmena sa novim (azuriranim vrednostima), tipa {@link NalogZaServisiranje}
     * @throws Exception ako dodje do greske na serverskoj strani
     */
    public void izmeniNalogZaServisiranje(NalogZaServisiranje nalogIzmena) throws Exception {
        Request request = new Request(Operation.IZMENI_NALOG_ZA_SERVISIRANJE, nalogIzmena);
        sender.send(request);
        System.out.println("Poslat request za izmenu");
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }
}
