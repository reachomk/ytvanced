package defpackage;

import android.view.View;
import java.util.LinkedHashMap;

/* renamed from: faf */
public final class faf {
    public CharSequence a;
    public View b;
    public faa c = faa.j().a();
    public boolean d;
    public boolean e;
    public Object f;
    public boolean g;
    private final LinkedHashMap h = new LinkedHashMap();

    public final faf a(ezu ezu) {
        this.h.put(Integer.valueOf(ezu.a()), ezu);
        return this;
    }

    public final faf a(amuw amuw) {
        this.h.clear();
        amxo amxo = (amxo) amuw.iterator();
        while (amxo.hasNext()) {
            ezu ezu = (ezu) amxo.next();
            this.h.put(Integer.valueOf(ezu.a()), ezu);
        }
        return this;
    }

    public final fag a() {
        return new fag(this.a, this.b, amuw.a(this.h.values()), this.d, this.e, this.f, this.g, this.c);
    }
}
