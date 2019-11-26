package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qea */
public final class qea {
    public Bitmap a;
    public String b;
    public final Bundle c = new Bundle();
    public String d;
    public String e;
    public final List f = new ArrayList();
    public boolean g;
    public qdu h;
    public final String i;

    public qea() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(currentTimeMillis);
        stringBuilder.append("-");
        stringBuilder.append(abs);
        this.i = stringBuilder.toString();
    }

    public final void a(boolean z) {
        if ((this.c.isEmpty() && this.f.isEmpty()) || this.g == z) {
            this.g = z;
            return;
        }
        throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
    }
}
