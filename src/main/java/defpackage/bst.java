package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: bst */
public abstract class bst implements bsv {
    private final String a;
    private final AssetManager b;
    private Object c;

    public bst(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    public abstract Object a(AssetManager assetManager, String str);

    public abstract void a(Object obj);

    public final void b() {
    }

    public final int c() {
        return 1;
    }

    public final void a(bre bre, bsy bsy) {
        try {
            this.c = a(this.b, this.a);
            bsy.a(this.c);
        } catch (IOException e) {
            bsy.a(e);
        }
    }

    public final void a() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }
}
