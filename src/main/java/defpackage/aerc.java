package defpackage;

import android.content.SharedPreferences.Editor;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: aerc */
final /* synthetic */ class aerc implements Runnable {
    private final aeqz a;

    aerc(aeqz aeqz) {
        this.a = aeqz;
    }

    public final void run() {
        afij[] afijArr;
        int i;
        aeqz aeqz = this.a;
        int k = aeqz.a.k();
        synchronized (aeqz) {
            ArrayDeque arrayDeque = (ArrayDeque) aeqz.c.get();
            afijArr = (afij[]) arrayDeque.toArray(new afij[arrayDeque.size()]);
            i = 0;
            aeqz.d = false;
        }
        int length = afijArr.length;
        ArrayList arrayList = new ArrayList(length);
        while (i < length) {
            afij afij = afijArr[i];
            if (afij.b != 0) {
                arrayList.add(afij);
            } else {
                afii afii = (afii) ((anxo) afij.toBuilder());
                afii.a(k);
                arrayList.add((afij) ((anxl) afii.build()));
            }
            i++;
        }
        afik afik = (afik) afil.b.createBuilder();
        afik.copyOnWrite();
        afil afil = (afil) afik.instance;
        if (!afil.a.a()) {
            afil.a = anxl.mutableCopy(afil.a);
        }
        anvf.addAll(arrayList, afil.a);
        String encodeToString = Base64.encodeToString(((afil) ((anxl) afik.build())).toByteArray(), 10);
        Editor edit = aeqz.b.edit();
        edit.putString("media_persisted_bandwidth_samples", encodeToString);
        edit.apply();
    }
}
