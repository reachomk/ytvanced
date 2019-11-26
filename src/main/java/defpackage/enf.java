package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: enf */
public class enf implements enc {
    public final aiub a;
    private final enc b;

    public enf(aiub aiub) {
        amqw.a((Object) aiub);
        if (amqw.a((Object) aiub) instanceof enc) {
            this.b = (enc) aiub;
        } else {
            this.b = new ene(aiub);
        }
        this.a = aiub;
    }

    public final View a() {
        return this.b.a();
    }

    public final LayoutParams b() {
        return this.b.b();
    }

    public boolean a(ejd ejd) {
        return this.b.a(ejd);
    }

    public final void b(ejd ejd) {
        this.b.b(ejd);
    }
}
