package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ajdy */
final /* synthetic */ class ajdy implements Runnable {
    private final ajdw a;

    ajdy(ajdw ajdw) {
        this.a = ajdw;
    }

    public final void run() {
        ajdw ajdw = this.a;
        amro amro = ajdw.a;
        String str = null;
        if (amro != null && amro.get() != null && ((Map) ajdw.a.get()).entrySet() != null) {
            for (Entry entry : ((Map) ajdw.a.get()).entrySet()) {
                if (!(entry == null || entry.getValue() == null)) {
                    if ("ms".equalsIgnoreCase((String) entry.getKey())) {
                        str = (String) entry.getValue();
                        break;
                    }
                }
            }
        }
        boolean z = true;
        if (str != null) {
            try {
                if (!((Boolean) ajdw.d.get()).booleanValue()) {
                    avat avat = (avat) avau.d.createBuilder();
                    String str2 = ajdw.b;
                    avat.copyOnWrite();
                    avau avau = (avau) avat.instance;
                    if (str2 != null) {
                        avau.a = 1 | avau.a;
                        avau.b = str2;
                        avat.copyOnWrite();
                        avau avau2 = (avau) avat.instance;
                        avau2.a |= 2;
                        avau2.c = str;
                        avau2 = (avau) ((anxl) avat.build());
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        if (avau2 != null) {
                            asmw.c = avau2;
                            asmw.b = 151;
                            z = ajdw.c.a((asmw) ((anxl) asmz.build()));
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
            } catch (Exception unused) {
                z = false;
            }
        }
        ajdw.e = z;
    }
}
