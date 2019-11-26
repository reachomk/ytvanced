package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: xmq */
final class xmq implements Runnable {
    private final /* synthetic */ xml a;

    xmq(xml xml) {
        this.a = xml;
    }

    public final void run() {
        nkp nkp;
        xml xml = this.a;
        xak.b();
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long a = xml.d.a();
        xbu d = xml.b.d();
        while (d.hasNext()) {
            nkp = (nkp) d.next();
            xmm xmm = (xmm) xml.a.get(nkp.b);
            if (xmm != null) {
                xmj a2 = xmm.a(nkp);
                if (a >= a2.a.c) {
                    String.format(Locale.US, "Executed scheduled task of type %s", new Object[]{a2.b()});
                    xml.e.execute(new xmp(a2));
                    if (a2.a.d > 0) {
                        arrayList2.add(nkp);
                    } else {
                        arrayList.add(a2.b());
                    }
                }
            } else {
                String valueOf = String.valueOf(nkp.b);
                String str = "Missing task factory for task type: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.d(valueOf);
                arrayList.add(nkp.b);
            }
        }
        d.a();
        xml.b.a();
        try {
            for (String str2 : arrayList) {
                String.format(Locale.US, "Removing task %s", new Object[]{str2});
                xml.b.a(str2);
            }
            for (int i = 0; i < arrayList2.size(); i++) {
                nks nks = (nks) ((anxo) ((nkp) arrayList2.get(i)).toBuilder());
                String.format(Locale.US, "Updating task %s", new Object[]{nks.a()});
                nks.a(((nkp) nks.instance).d + a);
                nkp = (nkp) ((anxl) nks.build());
                arrayList2.set(i, nkp);
                xml.b.a(nks.a(), nkp);
            }
            xml.b.c();
        } finally {
            xml.b.b();
        }
    }
}
