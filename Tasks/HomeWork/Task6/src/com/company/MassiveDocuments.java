package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MassiveDocuments {
    static void showDocument (Document[] massiveDocument){
        for (int i = 0; i < massiveDocument.length; i++){
           String value = massiveDocument[i] == null ? "________" : "Документ №" +i;
            System.out.println(value);
        }

    }
    static void createDocument (Document [] massiveDocument) {
        for (int i = 0; i< massiveDocument.length; i++){
            if (massiveDocument [i] == null) {
             massiveDocument [i] = new Document();
            }
        }
    }

    static void deleteDocument (Document [] massiveDocument, int a, int count) {
        for (int i=a; i < massiveDocument.length-1; i++) {
            massiveDocument[i] = massiveDocument [i+1];
                    }
                    massiveDocument [massiveDocument.length-1] = null;
        count--;


    }



}
