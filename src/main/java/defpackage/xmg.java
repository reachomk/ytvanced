package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: xmg */
final class xmg implements Runnable {
    private final /* synthetic */ xme a;

    xmg(xme xme) {
        this.a = xme;
    }

    public final void run() {
        String str;
        xmb xmb;
        xme xme = this.a;
        xak.b();
        ArrayList arrayList = new ArrayList();
        for (xmb xmb2 : xme.c.values()) {
            for (String str2 : xmb2.c()) {
                if (!((xmf) xme.b.get(str2)).a()) {
                    break;
                }
            }
            arrayList.add(xmb2);
        }
        Collections.sort(arrayList, xme.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xmb2 = (xmb) arrayList.get(i);
            String valueOf = String.valueOf(xmb2.b());
            str2 = "Executing ConditionTask ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            xmb2.a();
        }
    }
}
