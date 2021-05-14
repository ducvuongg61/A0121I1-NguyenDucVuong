package b5_access_modifier.thuchanh;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;

public class Simple {

    static class ChuNhat {
        public int rong, dai;

        public ChuNhat(int rong, int dai) {
            this.rong = rong;
            this.dai = dai;
        }
    }

    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        Simple o = new Simple();
        ChuNhat cn = new ChuNhat(1,1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}

