package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;

/* renamed from: sqm */
final class sqm implements sxl {
    sqm() {
    }

    public final int a() {
        return 168774763;
    }

    public final /* synthetic */ anrc a(ByteBuffer byteBuffer) {
        return baoi.a(byteBuffer, new baoi());
    }

    public final /* synthetic */ void a(cmg cmg, Object obj, swn swn) {
        baoi baoi = (baoi) obj;
        clz a = swn.a();
        int a2 = baoi.a(6);
        CharSequence charSequence = null;
        CharSequence c = a2 != 0 ? baoi.c(a2 + baoi.a) : null;
        int a3 = baoi.a(4);
        CharSequence c2 = a3 != 0 ? baoi.c(a3 + baoi.a) : null;
        int isEmpty = TextUtils.isEmpty(c) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(c2) ^ 1;
        if (isEmpty != 0 && isEmpty2 != 0) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(c2).length() + 1) + String.valueOf(c).length());
            stringBuilder.append(c2);
            stringBuilder.append(" ");
            stringBuilder.append(c);
            charSequence = stringBuilder.toString();
        } else if (isEmpty != 0) {
            charSequence = c;
        } else if (isEmpty2 != 0) {
            charSequence = c2;
        }
        if (!TextUtils.isEmpty(baoi.a())) {
            a.b(baoi.a());
        }
        if (charSequence != null) {
            a.a(charSequence);
        }
        if (baoi.b()) {
            a.a(baoi.b());
        }
    }
}
