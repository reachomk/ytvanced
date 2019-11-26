package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: otd */
public final class otd extends ori {
    private static final int a = ozp.f("styl");
    private static final int b = ozp.f("tbox");
    private final oza c = new oza();
    private final boolean d;
    private final int e;
    private final int f;
    private final String g;
    private float h;
    private int i;

    public otd(List list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.e = bArr[24];
            this.f = ((((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16)) | ((bArr[28] & 255) << 8)) | (bArr[29] & 255);
            if ("Serif".equals(ozp.a(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.g = str;
            int i = bArr[25] * 20;
            this.i = i;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.d = z;
            if (z) {
                float f = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i);
                this.h = f;
                this.h = ozp.a(f, 0.0f, 0.95f);
                return;
            }
            this.h = 0.85f;
            return;
        }
        this.e = 0;
        this.f = -1;
        this.g = str;
        this.d = false;
        this.h = 0.85f;
    }

    /* Access modifiers changed, original: protected|final */
    public final ork a(byte[] bArr, int i, boolean z) {
        String str;
        int i2;
        int i3;
        this.c.a(bArr, i);
        oza oza = this.c;
        otd.a(oza.b() >= 2);
        int e = oza.e();
        if (e == 0) {
            str = "";
        } else {
            if (oza.b() >= 2) {
                byte[] bArr2 = oza.a;
                i2 = oza.b;
                i3 = (bArr2[i2 + 1] & 255) | ((bArr2[i2] & 255) << 8);
                if (i3 == 65279 || i3 == 65534) {
                    str = oza.a(e, Charset.forName("UTF-16"));
                }
            }
            str = oza.a(e, Charset.forName("UTF-8"));
        }
        if (str.isEmpty()) {
            return otg.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        otd.a(spannableStringBuilder2, this.e, 0, 0, spannableStringBuilder.length(), 16711680);
        otd.b(spannableStringBuilder2, this.f, -1, 0, spannableStringBuilder.length(), 16711680);
        str = this.g;
        i3 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, i3, 16711713);
        }
        float f = this.h;
        while (this.c.b() >= 8) {
            oza oza2 = this.c;
            int i4 = oza2.b;
            int k = oza2.k();
            i3 = this.c.k();
            if (i3 == a) {
                otd.a(this.c.b() >= 2);
                int e2 = this.c.e();
                int i5 = 0;
                while (i5 < e2) {
                    oza2 = this.c;
                    otd.a(oza2.b() >= 12);
                    int e3 = oza2.e();
                    int e4 = oza2.e();
                    oza2.d(2);
                    i2 = oza2.d();
                    oza2.d(1);
                    int k2 = oza2.k();
                    spannableStringBuilder2 = spannableStringBuilder;
                    int i6 = e3;
                    int i7 = e4;
                    int i8 = i5;
                    otd.a(spannableStringBuilder2, i2, this.e, i6, i7, 0);
                    otd.b(spannableStringBuilder2, k2, this.f, i6, i7, 0);
                    i5 = i8 + 1;
                }
            } else if (i3 == b && this.d) {
                otd.a(this.c.b() >= 2);
                f = ozp.a(((float) this.c.e()) / ((float) this.i), 0.0f, 0.95f);
            }
            this.c.c(i4 + k);
        }
        return new otg(new orf(spannableStringBuilder, f, Float.MIN_VALUE, aocf.UNSET_ENUM_VALUE));
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            i2 = i5 | 33;
            i5 = i & 1;
            int i6 = i & 2;
            Object obj = i6 == 0 ? null : 1;
            if (i5 == 0) {
                if (obj != null) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i2);
                }
            } else if (obj != null) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i2);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i2);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i2);
            } else if (i5 == 0 && i6 == 0) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i2);
            }
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void a(boolean z) {
        if (!z) {
            throw new orm("Unexpected subtitle format.");
        }
    }
}
