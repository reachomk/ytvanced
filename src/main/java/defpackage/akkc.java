package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: akkc */
public class akkc implements afnw {
    private final akjz a;
    private final Context b;

    public akkc(Context context) {
        this.b = (Context) amqw.a((Object) context);
        this.a = new akjz(xss.f(context), Config.ARGB_8888);
    }

    public Drawable a(byte[] bArr) {
        return b(bArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final Drawable b(byte[] bArr) {
        return new BitmapDrawable(this.b.getResources(), this.a.a(bArr));
    }
}
