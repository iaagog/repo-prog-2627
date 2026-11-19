package es.iesteis.prog.ud4;

public class TestReloj{
    private RelojAlarma miReloj;
    private RelojAlarma tuReloj;

    public TestReloj(){
        miReloj = new RelojAlarma(18, 32);
        tuReloj = new RelojAlarma(23, 58);
    }

    public void test1(){
        miReloj.setAlarma(18,35);
        System.out.println("La hora de mi reloj es " + miReloj.getHora());
        System.out.println("La hora de mi alarma es " + miReloj.getAlarma());
        miReloj.emitirTic();
        miReloj.emitirTic();
        miReloj.emitirTic();
    }

    public void test2(){
        tuReloj.setAlarma(7,00);
        System.out.println("La hora actual de tu reloj es " + tuReloj.getHora());
        System.out.println("La hora de mi alarma es " + tuReloj.getAlarma());
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        System.out.println("La hora actual de tu reloj es " + tuReloj.getHora());
    }

    public void test3(){
        tuReloj.setAlarma(2,1);
        tuReloj.ponerEnHora(1,59);
        tuReloj.emitirTic();
        tuReloj.emitirTic();
    }
}
