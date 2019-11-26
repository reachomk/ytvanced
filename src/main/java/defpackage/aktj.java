package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: aktj */
public final class aktj extends aktm {
    public aktj(Context context, akte akte, boolean z, akto akto) {
        super(context, akte, z, akto, true);
    }

    public final void a(arml arml, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, StringBuilder stringBuilder, Object obj, int i) {
        if (arml != null && arml.b.size() > 0) {
            a(obj, i, spannableStringBuilder);
            int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
            int max2 = Math.max(stringBuilder.length() - charSequence.length(), 0);
            float dimension = this.a.getResources().getDimension(R.dimen.emoji_height);
            for (armp armp : arml.b) {
                int length;
                anxr access$000 = anxl.checkIsLite(ardw.g);
                armp.a(access$000);
                if (armp.h.a(access$000.d)) {
                    Object obj2;
                    access$000 = anxl.checkIsLite(ardw.g);
                    armp.a(access$000);
                    Object b = armp.h.b(access$000.d);
                    if (b == null) {
                        obj2 = access$000.b;
                    } else {
                        obj2 = access$000.a(b);
                    }
                    ardw ardw = (ardw) obj2;
                    anxr access$0002 = anxl.checkIsLite(ardw.g);
                    armp.a(access$0002);
                    Object b2 = armp.h.b(access$0002.d);
                    if (b2 == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b2);
                    }
                    aygk aygk = ((ardw) b).d;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    if ((ardw.a & 4) != 0 && aygk.b.size() > 0) {
                        spannableStringBuilder.delete(max, armp.b.length() + max);
                        spannableStringBuilder.insert(max, "□");
                        aktc aktc = new aktc();
                        aktc.a = obj;
                        aktc.b = i;
                        aktc.e = dimension;
                        aktc.c = max;
                        max++;
                        aktc.d = max;
                        this.b.a(aktc, aygk, Math.round(dimension), this);
                        if (this.d) {
                            String a = aktm.a(aygk);
                            if (!TextUtils.isEmpty(a)) {
                                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 2);
                                String str = " ";
                                stringBuilder2.append(str);
                                stringBuilder2.append(a);
                                stringBuilder2.append(str);
                                stringBuilder.insert(max2, stringBuilder2.toString());
                                length = a.length() + 2;
                                max2 += length;
                            }
                        }
                    }
                }
                if (!armp.b.isEmpty()) {
                    max += armp.b.length();
                    if (this.d) {
                        length = armp.b.length();
                        max2 += length;
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(aktc aktc, Bitmap bitmap) {
        super.a(aktc, bitmap);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }
}
