package defpackage;

import android.util.Log;

/* renamed from: annh */
final class annh extends pup {
    public final /* synthetic */ annf a;

    annh(annf annf) {
        this.a = annf;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(psp psp, ryl ryl) {
        anmy a = ((anmk) ((anmw) psp).v()).a(new anng(this, ryl), this.a.a);
        int i = a != null ? a.a : 2;
        boolean z = false;
        boolean z2 = true;
        annf annf = null;
        if (i != 3) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("API call failed. Status code: ");
                stringBuilder.append(i);
                String stringBuilder2 = stringBuilder.toString();
                if (Log.isLoggable("FirebaseAppIndex", 6) || Log.isLoggable("FirebaseAppIndex", 6)) {
                    Log.e("FirebaseAppIndex", stringBuilder2);
                }
                if (ryl.b(null)) {
                    this.a.b.a(new anlw("Indexing error."));
                }
            }
            synchronized (this.a.c.b) {
                if (((annf) this.a.c.b.poll()) != this.a) {
                    z2 = false;
                }
                pzr.a(z2);
                annf = (annf) this.a.c.b.peek();
                this.a.c.c = 0;
            }
        } else if (ryl.b(null)) {
            synchronized (this.a.c.b) {
                annc annc = this.a.c;
                if (annc.c != 0) {
                    annc.c = 2;
                } else {
                    annf annf2 = (annf) annc.b.peek();
                    if (annf2 == this.a) {
                        z = true;
                    }
                    pzr.a(z);
                    annf = annf2;
                }
            }
        }
        if (annf != null) {
            annf.a();
        }
    }
}
