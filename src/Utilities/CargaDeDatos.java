/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.CambioEstado;
import Models.Cliente;
import Models.Encuesta;
import Models.Estado;
import Models.Llamada;
import Models.Pregunta;
import Models.RespuestaDeCliente;
import Models.RespuestaPosible;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rces0
 */
public class CargaDeDatos {

    public CargaDeDatos() {
    }

    public static LocalDateTime fechaHoraInicio = LocalDateTime.now();

    //Estados
    static final Estado estado1 = new Estado("Iniciada");    
    static final Estado estado3 = new Estado("EnCurso");
    static final Estado estado2 = new Estado("Finalizada");

    //Cambio Estados
    static final CambioEstado cambioEstado1 = new CambioEstado(LocalDateTime.parse("2023-05-04T13:30:00"), estado1);
    static final CambioEstado cambioEstado2 = new CambioEstado(LocalDateTime.parse("2023-05-04T13:33:00"), estado2);
    static final CambioEstado cambioEstado3 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:30:01"), estado1);
    static final CambioEstado cambioEstado4 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:34:00"), estado2);
    static final CambioEstado cambioEstado5 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:40:00"), estado1);
    static final CambioEstado cambioEstado6 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:50:00"), estado2);
    static final CambioEstado cambioEstado7 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:30:00"), estado1);
    static final CambioEstado cambioEstado8 = new CambioEstado(LocalDateTime.parse("2023-05-04T14:35:00"), estado2);
    static final CambioEstado cambioEstado9 = new CambioEstado(LocalDateTime.parse("2023-05-04T15:30:01"), estado1);
    static final CambioEstado cambioEstado10 = new CambioEstado(LocalDateTime.parse("2023-05-04T15:30:40"), estado2);
    static final CambioEstado cambioEstado11 = new CambioEstado(LocalDateTime.parse("2023-05-05T17:30:00"), estado1);
    static final CambioEstado cambioEstado12 = new CambioEstado(LocalDateTime.parse("2023-05-05T17:34:00"), estado2);
    static final CambioEstado cambioEstado13 = new CambioEstado(LocalDateTime.parse("2023-05-05T17:20:00"), estado1);
    static final CambioEstado cambioEstado14 = new CambioEstado(LocalDateTime.parse("2023-05-05T18:25:00"), estado2);
    static final CambioEstado cambioEstado15 = new CambioEstado(LocalDateTime.parse("2023-05-05T18:30:00"), estado1);
    static final CambioEstado cambioEstado16 = new CambioEstado(LocalDateTime.parse("2023-05-05T18:30:59"), estado2);
    static final CambioEstado cambioEstado18 = new CambioEstado(LocalDateTime.parse("2023-05-06T18:33:00"), estado1);
    static final CambioEstado cambioEstado19 = new CambioEstado(LocalDateTime.parse("2023-05-06T18:34:00"), estado2);
    static final CambioEstado cambioEstado20 = new CambioEstado(LocalDateTime.parse("2023-05-06T18:35:00"), estado1);
    static final CambioEstado cambioEstado21 = new CambioEstado(LocalDateTime.parse("2023-05-06T19:40:00"), estado2);
    static final CambioEstado cambioEstado22 = new CambioEstado(LocalDateTime.parse("2023-05-06T19:41:00"), estado1);
    static final CambioEstado cambioEstado23 = new CambioEstado(LocalDateTime.parse("2023-05-06T19:56:00"), estado2);
    static final CambioEstado cambioEstado24 = new CambioEstado(LocalDateTime.parse("2023-05-14T13:57:00"), estado1);
    static final CambioEstado cambioEstado25 = new CambioEstado(LocalDateTime.parse("2023-05-14T14:30:01"), estado2);
    static final CambioEstado cambioEstado26 = new CambioEstado(LocalDateTime.parse("2023-05-14T14:30:10"), estado1);
    static final CambioEstado cambioEstado27 = new CambioEstado(LocalDateTime.parse("2023-05-14T13:30:03"), estado2);
    static final CambioEstado cambioEstado28 = new CambioEstado(LocalDateTime.parse("2023-05-14T09:30:30"), estado1);
    static final CambioEstado cambioEstado29 = new CambioEstado(LocalDateTime.parse("2023-05-14T09:30:30"), estado2);

    //Cliente
    static final Cliente cliente1 = new Cliente(112345678, "Pedro1 Diaz", "351333111122");
    static final Cliente cliente2 = new Cliente(222345678, "Pedro2 Rodruiguez", "351333111122");
    static final Cliente cliente3 = new Cliente(332345678, "Pedro3 Lamas", "351333111122");    
    static final Cliente cliente4 = new Cliente(332345678, "Pedro4 Lamas", "351333111122");
        static final Cliente cliente5 = new Cliente(332345678, "Pedro5 Lamas", "351333111122");
            static final Cliente cliente6 = new Cliente(332345678, "Pedro6 Lamas", "351333111122");
                static final Cliente cliente7 = new Cliente(332345678, "Pedro7 Lamas", "351333111122");             
                static final Cliente cliente8 = new Cliente(332345678, "PRUEBA", "351333111122");




    //RespuestaPosible
    ////calidad atencion
    static final RespuestaPosible respuestaPosible1 = new RespuestaPosible("Excelente", 1);
    static final RespuestaPosible respuestaPosible2 = new RespuestaPosible("Muy buena", 2);
    static final RespuestaPosible respuestaPosible3 = new RespuestaPosible("Buena", 3);
    static final RespuestaPosible respuestaPosible4 = new RespuestaPosible("Regular", 4);
    static final RespuestaPosible respuestaPosible5 = new RespuestaPosible("Mala", 5);
    static final RespuestaPosible respuestaPosible6 = new RespuestaPosible("Muy mala", 6);
    ////Respuestas para si y no
    static final RespuestaPosible respuestaPosible7 = new RespuestaPosible("Si recomienda el servicio", 1);
    static final RespuestaPosible respuestaPosible8 = new RespuestaPosible("No recomientda el servicio", 2);
    static final RespuestaPosible respuestaPosible21 = new RespuestaPosible("No soluciono ", 2);
        static final RespuestaPosible respuestaPosible22 = new RespuestaPosible("Si soluciono", 1);
    static final RespuestaPosible respuestaPosible19 = new RespuestaPosible("No recomendo ", 2);   
    static final RespuestaPosible respuestaPosible20 = new RespuestaPosible("Si recomendo ", 2);
    
        static final RespuestaPosible respuestaPosible30 = new RespuestaPosible("No brindo  ", 2);   
    static final RespuestaPosible respuestaPosible31 = new RespuestaPosible("Si brindo", 2);

    static final RespuestaPosible respuestaPosible24 = new RespuestaPosible("Si obtuvo prestamo", 1);
    static final RespuestaPosible respuestaPosible25 = new RespuestaPosible("No obtuvo prestamo", 2);

    static final RespuestaPosible respuestaPosible9 = new RespuestaPosible("mayor a 100", 1);
    static final RespuestaPosible respuestaPosible11 = new RespuestaPosible("mayor a 200", 2);
    static final RespuestaPosible respuestaPosible12 = new RespuestaPosible("otro", 3);
    static final RespuestaPosible respuestaPosible13 = new RespuestaPosible("3", 3);
    static final RespuestaPosible respuestaPosible14 = new RespuestaPosible("6", 6);
    static final RespuestaPosible respuestaPosible15 = new RespuestaPosible("9", 9);
    static final RespuestaPosible respuestaPosible16 = new RespuestaPosible("12", 1);  
        static final RespuestaPosible respuestaPosible41 = new RespuestaPosible("ahora 3", 1);

            static final RespuestaPosible respuestaPosible42 = new RespuestaPosible("ahora 6", 1);
    static final RespuestaPosible respuestaPosible43 = new RespuestaPosible("ahora 12", 1);
    static final RespuestaPosible respuestaPosible44 = new RespuestaPosible("1 sin interes", 1);



    //Preguntas
    static final Pregunta pregunta1 = new Pregunta("Calidad de la atencion", new RespuestaPosible[]{respuestaPosible1, respuestaPosible2, respuestaPosible3, respuestaPosible4, respuestaPosible5, respuestaPosible6});
    static final Pregunta pregunta2 = new Pregunta("Recomendar el servicio", new RespuestaPosible[]{respuestaPosible7, respuestaPosible8});
    static final Pregunta pregunta3 = new Pregunta("Soluciono la consulta", new RespuestaPosible[]{respuestaPosible21, respuestaPosible22});
    static final Pregunta pregunta4 = new Pregunta("El comercio brindo la informacion necesaria para la compra", new RespuestaPosible[]{respuestaPosible30, respuestaPosible31});
    static final Pregunta pregunta5 = new Pregunta("Recomendo seis cuotas sin interes", new RespuestaPosible[]{respuestaPosible19, respuestaPosible20});
    static final Pregunta pregunta6 = new Pregunta("Que plan uso", new RespuestaPosible[]{respuestaPosible41, respuestaPosible42, respuestaPosible43, respuestaPosible44});
    static final Pregunta pregunta7 = new Pregunta("Solicito prestamo en los ultimos 3 meses", new RespuestaPosible[]{respuestaPosible24, respuestaPosible25});
    static final Pregunta pregunta8 = new Pregunta("Estimado prestamo", new RespuestaPosible[]{respuestaPosible9, respuestaPosible11, respuestaPosible12});
    static final Pregunta pregunta9 = new Pregunta("Cuantas cuotas", new RespuestaPosible[]{respuestaPosible13, respuestaPosible14, respuestaPosible15, respuestaPosible16});

    //Encuestas
    static final Encuesta encuesta1
            = new Encuesta("Encuesta atencion al cliente", LocalDate.parse("2023-05-23"), new Pregunta[]{pregunta1, pregunta2, pregunta3});
    static final Encuesta encuesta2
            = new Encuesta("Encuesta Sobre comercio donde compro", LocalDate.parse("2023-05-23"), new Pregunta[]{pregunta4, pregunta5, pregunta6});
    static final Encuesta encuesta3
            = new Encuesta("Encuesta prestamo", LocalDate.parse("2023-05-23"), new Pregunta[]{pregunta7, pregunta8, pregunta9});

    //respuesta del cliente encuesta calidad del servicio
    static final RespuestaDeCliente respuesta1Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible1); //excelente
    static final RespuestaDeCliente respuesta2Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible7);//si recopmientda 
    static final RespuestaDeCliente respuesta3Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible22);//si soluciono consulta
    //Encuieta de donde compro usando la tarjeta
    static final RespuestaDeCliente respuesta4Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible31); //si brindo info
    static final RespuestaDeCliente respuesta5Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible19);//no recomendo 6 cuotas
    static final RespuestaDeCliente respuesta6Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible41); //uso 3 ctas sin interes
    //Encuesta de prestamo
    static final RespuestaDeCliente respuesta7Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible24); //si solicito prestamos
    static final RespuestaDeCliente respuesta8Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible9);//mayor a 100
    static final RespuestaDeCliente respuesta9Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible12);//otro
//Atencion al cliente
    static final RespuestaDeCliente respuesta10Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible5); //mala
    static final RespuestaDeCliente respuesta11Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible8); //no recomieda
    static final RespuestaDeCliente respuesta12Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible21);// no soluciono problema
    //info comercio
    static final RespuestaDeCliente respuesta13Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible30);//no brindo ingo
    static final RespuestaDeCliente respuesta14Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible19); //si recomendo 6 cuptas
    static final RespuestaDeCliente respuesta15Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible42);//usop 6 cuoptas
    
    static final RespuestaDeCliente respuesta16Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible25); //no sol prest
    static final RespuestaDeCliente respuesta17Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible11); //si recominesa
    static final RespuestaDeCliente respuesta18Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible15);// no soluiciono
    
    static final RespuestaDeCliente respuesta19Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible6);// muy mala   
    static final RespuestaDeCliente respuesta20Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible8);// si soluciono
    static final RespuestaDeCliente respuesta21Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible22);// no recomienda
    static final RespuestaDeCliente respuesta22Cliente = new RespuestaDeCliente(LocalDate.parse("2023-05-19"), respuestaPosible14);// mala

    //Llamdas
//    static final Llamada llamada11
//            = new Llamada("operador222", "accionrequerida1", 1.2, true, "Sin observacion", new CambioEstado[]{cambioEstado1, cambioEstado2}, cliente1, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});

    static final Llamada llamada2 = new Llamada("operador223", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado1, cambioEstado2}, cliente1, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada3 = new Llamada("operador224", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado3, cambioEstado4}, cliente2, new RespuestaDeCliente[]{respuesta4Cliente, respuesta5Cliente, respuesta6Cliente});
    static final Llamada llamada4 = new Llamada("operador225", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado5, cambioEstado6}, cliente3, new RespuestaDeCliente[]{respuesta7Cliente, respuesta8Cliente, respuesta9Cliente});
    static final Llamada llamada5 = new Llamada("operador226", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado7, cambioEstado8}, cliente4, new RespuestaDeCliente[]{respuesta10Cliente, respuesta11Cliente, respuesta12Cliente});
    static final Llamada llamada6 = new Llamada("operador227", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado9, cambioEstado10}, cliente5, new RespuestaDeCliente[]{respuesta13Cliente, respuesta14Cliente, respuesta15Cliente});
    static final Llamada llamada7 = new Llamada("operador228", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado11, cambioEstado12}, cliente6, new RespuestaDeCliente[]{respuesta16Cliente, respuesta17Cliente, respuesta18Cliente});
    static final Llamada llamada9 = new Llamada("operador210", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado15, cambioEstado16}, cliente7, new RespuestaDeCliente[]{respuesta19Cliente, respuesta20Cliente, respuesta21Cliente});
    
    static final Llamada llamada10 = new Llamada("operador211", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado18, cambioEstado18}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada11 = new Llamada("operador212", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado19, cambioEstado20}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada12 = new Llamada("operador213", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado20, cambioEstado21}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada13 = new Llamada("operador214", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado22, cambioEstado23}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada14 = new Llamada("operador215", "accionrequerida1", 0.1, true, "Sin observacion", new CambioEstado[]{cambioEstado24, cambioEstado25}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada15 = new Llamada("operador216", "accionrequerida1", 0.1, false, "sin encuesta enviada", new CambioEstado[]{cambioEstado26, cambioEstado27}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada16 = new Llamada("operador217", "accionrequerida1", 0.1, false, "sin encuesta enviada", new CambioEstado[]{cambioEstado28}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada17 = new Llamada("operador218", "accionrequerida1", 0.1, false, "sin encuesta enviada", new CambioEstado[]{cambioEstado29}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});
    static final Llamada llamada18 = new Llamada("operador219", "accionrequerida1", 0.1, false, "sin encuesta enviada", new CambioEstado[]{cambioEstado1}, cliente8, new RespuestaDeCliente[]{respuesta1Cliente, respuesta2Cliente, respuesta3Cliente});



    public static List<Llamada> getLLamadas() {
        List<Llamada> llamadas = new ArrayList<Llamada>();
//        llamadas.add(llamada11);
        llamadas.add(llamada2);
        llamadas.add(llamada3);
        llamadas.add(llamada4);
        llamadas.add(llamada5);
        llamadas.add(llamada6);
        llamadas.add(llamada7);
        llamadas.add(llamada9);
        llamadas.add(llamada10);
        llamadas.add(llamada11);
        llamadas.add(llamada12);
        llamadas.add(llamada13);
        llamadas.add(llamada14);
        llamadas.add(llamada15);
        llamadas.add(llamada16);
        llamadas.add(llamada17);
        llamadas.add(llamada18);
        return llamadas;
    }

    public static List<CambioEstado> getCambioEstados() {
        List<CambioEstado> cambioestados = new ArrayList<CambioEstado>();
        cambioestados.add(cambioEstado1);
        cambioestados.add(cambioEstado2);
        cambioestados.add(cambioEstado3);
        cambioestados.add(cambioEstado4);
        cambioestados.add(cambioEstado5);
        cambioestados.add(cambioEstado6);
        cambioestados.add(cambioEstado7);
        cambioestados.add(cambioEstado8);
        cambioestados.add(cambioEstado9);
        cambioestados.add(cambioEstado10);
        cambioestados.add(cambioEstado11);
        cambioestados.add(cambioEstado12);
        cambioestados.add(cambioEstado13);
        cambioestados.add(cambioEstado14);
        cambioestados.add(cambioEstado15);
        cambioestados.add(cambioEstado16);
        cambioestados.add(cambioEstado18);
        cambioestados.add(cambioEstado19);
        cambioestados.add(cambioEstado20);
        cambioestados.add(cambioEstado21);
        cambioestados.add(cambioEstado22);
        cambioestados.add(cambioEstado23);
        cambioestados.add(cambioEstado24);
        cambioestados.add(cambioEstado25);
        cambioestados.add(cambioEstado26);
        cambioestados.add(cambioEstado27);
        cambioestados.add(cambioEstado28);
        cambioestados.add(cambioEstado29);

        return cambioestados;
    }

    public static List<Encuesta> getEncuestas() {
       List<Encuesta> encuestas = new ArrayList<Encuesta>();
        encuestas.add(encuesta1);
        encuestas.add(encuesta2);
        encuestas.add(encuesta3);

        return encuestas;
    }

}
