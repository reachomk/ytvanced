package defpackage;

import java.util.List;

/* renamed from: aktd */
public final class aktd {
    public final armt a;
    public final List b;
    public arml c;

    public aktd(armr armr) {
        arml arml = null;
        armt armt = ((armr) amqw.a((Object) armr)).a == 1 ? armr.a == 1 ? (armt) armr.b : armt.d : null;
        this.a = armt;
        this.b = ((armr) amqw.a((Object) armr)).c;
        if (armr.a == 1) {
            armt = (armt) armr.b;
        } else {
            armt = armt.d;
        }
        if ((armt.a & 1) != 0) {
            armt armt2;
            if (armr.a == 1) {
                armt2 = (armt) armr.b;
            } else {
                armt2 = armt.d;
            }
            arml = armt2.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        this.c = arml;
    }
}
