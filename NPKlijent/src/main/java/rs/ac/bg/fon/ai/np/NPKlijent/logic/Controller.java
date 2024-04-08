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
import rs.ac.bg.fon.ai.np.NPCommon.domain.Serviser;

/**
 *
 * @author Cartman
 */
public class Controller {

    Socket socket;
    Sender sender;
    Receiver receiver;

    private static Controller instance;

    private Controller() throws Exception {
        socket = new Socket("localhost", 9000);
        sender = new Sender(socket);
        receiver = new Receiver(socket);
    }

    public static Controller getInstance() throws Exception {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Serviser login(Serviser serviser) throws Exception {
        Request request = new Request(Operation.LOGIN, serviser);
        sender.send(request);

        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            return (Serviser) response.getResult();
        } else {
            throw response.getException();
        }
    }

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

    public void izmeniAutomobil(Automobil automobil) throws Exception {
        Request request = new Request(Operation.IZMENI_AUTOMOBIL, automobil);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void obrisiAUtomobil(Automobil automobil) throws Exception {
        Request request = new Request(Operation.OBRISI_AUTOMOBIL, automobil);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }


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

    public void sacuvajPokvareniDeo(PokvareniDeo pokvareniDeo) throws Exception {
        Request request = new Request(Operation.SACUVAJ_POKVAREN_DEO, pokvareniDeo);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() == null) {
            //auto.setAutoID(((Automobil)response.getResult()).getAutoID());
            System.out.println("Uspesno sacuvan pokvareni deo!");
        } else {
            throw response.getException();
        }
    }


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

    public void obrisiPokvarenDeo(PokvareniDeo pokvareniDeo) throws Exception {
        Request request = new Request(Operation.OBRISI_POKVAREN_DEO, pokvareniDeo);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void izmeniPokvareniDeo(PokvareniDeo pokvareniDeo) throws Exception {
        Request request = new Request(Operation.IZMENI_POKVAREN_DEO, pokvareniDeo);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

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


    public void obrisiNalogZaServisiranje(NalogZaServisiranje nalog) throws Exception {
        Request request = new Request(Operation.OBRISI_NALOG_ZA_SERVISIRANJE, nalog);
        sender.send(request);
        Response response = (Response) receiver.receive();
        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void logout(Serviser serviser) throws Exception {
        Request request = new Request(Operation.LOGOUT, serviser);
        sender.send(request);
        //zatvori socket
        if(!socket.isClosed() && socket != null){
            socket.close();
            System.out.println("Socket je zatvoren kod klijenta!");
        }
    }

}
