package fr.esgi;


import fr.esgi.log.*;
import fr.esgi.log.Readable;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    static void main() {

        Readable source1 = new Request("Je me connecte");
        Readable source2 = new Response("Je suis connecté");

        Log<Readable> log = new Log<>(CRITICITY.INFO, LocalDateTime.now(), 200, source1);
        Log<Readable> log2 = new Log<>(CRITICITY.ERROR, LocalDateTime.now(), 500, source2);

        System.out.println(log.getMessage());
        System.out.println(log2.getMessage());
    }
}
