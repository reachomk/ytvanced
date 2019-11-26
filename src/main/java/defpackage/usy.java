package defpackage;

import android.accounts.Account;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: usy */
public final class usy implements Runnable {
    private final /* synthetic */ ust a;
    private final /* synthetic */ WeakReference b;
    private final /* synthetic */ arzg c = null;
    private final /* synthetic */ usv d;

    public usy(usv usv, ust ust, WeakReference weakReference) {
        this.d = usv;
        this.a = ust;
        this.b = weakReference;
    }

    public final void run() {
        usv usv = this.d;
        Account[] b = usv.b.b();
        ust ust = this.a;
        WeakReference weakReference = this.b;
        ArrayList arrayList = new ArrayList();
        int length = b.length;
        int i = 0;
        while (i < length) {
            Account account = b[i];
            afsx afsx = new afsx();
            boolean z = ust != null && ust.b().equals(account.name);
            boolean z2 = z;
            Account[] accountArr = b;
            afsx afsx2 = afsx;
            usv.a.a(!z ? ust.a(account.name) : ust, afsx, account.name, !z ? 5 : 3, null);
            arrayList.add(new usz(account, z2, afsx2));
            i++;
            b = accountArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        i = arrayList.size();
        for (int i2 = 0; i2 < i; i2++) {
            usz usz = (usz) arrayList.get(i2);
            try {
                aaof aaof = (aaof) usz.c.get();
                arrayList2.add(aaof);
                if (aaof.b == null) {
                    ajrf[] ajrfArr = aaof.a.a;
                    if (ajrfArr != null) {
                        for (ajrf ajrf : ajrfArr) {
                            aofb aofb = ajrf.b;
                            if (aofb != null) {
                                aaof.b = new aanw(aofb);
                                break;
                            }
                        }
                    }
                }
                aanw aanw = aaof.b;
                arrayList3.addAll(aanw.a());
                if (usz.b) {
                    arrayList4.addAll(aanw.b());
                }
            } catch (InterruptedException | ExecutionException th) {
                Object a;
                Throwable th2 = th2.getCause();
                String str = usz.a.name;
                if (th2 instanceof bpx) {
                    a = aanx.a(str, new aanu(((bpx) th2).a, th2));
                } else {
                    a = aanx.a(str, aanu.a(th2));
                }
                arrayList3.add(a);
            }
        }
        usv.d.execute(new usx(weakReference, new uta(arrayList2, new aanw(arrayList3, arrayList4))));
    }
}
