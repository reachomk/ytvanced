package defpackage;

import android.content.Intent;

/* renamed from: qac */
public final class qac extends qaa {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ puf b;
    private final /* synthetic */ int c = 2;

    public qac(Intent intent, puf puf) {
        this.a = intent;
        this.b = puf;
    }

    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
