package defpackage;

import android.view.TextureView;
import java.util.Arrays;

/* renamed from: znl */
public final class znl {
    public final String a;
    public final TextureView b;
    public final zno c;

    znl(String str, TextureView textureView, zno zno) {
        this.a = str;
        this.b = (TextureView) amqw.a((Object) textureView);
        this.c = zno;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof znl)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        znl znl = (znl) obj;
        return amqq.a(this.a, znl.a) && amqq.a(this.b, znl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
