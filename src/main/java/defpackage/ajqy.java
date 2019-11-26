package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ajqy */
public final class ajqy {
    private static final CharSequence a = " · ";
    private static final CharSequence[] b = new CharSequence[0];
    private static final Spanned c = new SpannedString("");

    public static Spanned a(arml arml) {
        return ajqy.a(null, arml, 0, null);
    }

    private static String b(String str) {
        return str == null ? "" : str;
    }

    public static Spanned a(arml arml, ajqr ajqr) {
        return ajqy.a(null, arml, 0, ajqr);
    }

    public static Spanned a(arml arml, ajqw ajqw) {
        ajqv ajqv = new ajqv(ajqw);
        ajqv.b = arml;
        ajqw a = ajqv.a();
        if (a == null) {
            return ajqy.a(null, null, 0, null);
        }
        return ajqy.a(a.a, a.b, 0, a.c);
    }

    public static Spanned a(Context context, arml arml, int i, ajqr ajqr) {
        Context context2 = context;
        arml arml2 = arml;
        ajqr ajqr2 = ajqr;
        if (arml2 == null) {
            return null;
        }
        if (!TextUtils.isEmpty(arml2.c)) {
            return new SpannedString(arml2.c);
        }
        if (arml2.b.size() == 0) {
            return c;
        }
        int a;
        int i2 = 0;
        if (arml2.b.size() > 0 && arml2.b.size() != 0 && arml2.b.size() <= 1 && i == 0) {
            armp armp = (armp) arml2.b.get(0);
            if (!(armp.c || armp.d || armp.f || armp.e || armp.g || armp.i != 0 || (armp.a & 256) != 0)) {
                a = armj.a(armp.j);
                if (a == 0 || a == 1) {
                    return new SpannedString(((armp) arml2.b.get(0)).b);
                }
            }
        }
        ajqt a2 = ajqx.a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        int i4 = 0;
        for (armp armp2 : arml2.b) {
            if (!armp2.b.isEmpty()) {
                if (!TextUtils.isEmpty(armp2.b)) {
                    i3 += armp2.b.length();
                    spannableStringBuilder.append(armp2.b);
                    int i5 = armp2.c | (!armp2.d ? 0 : 2);
                    if (i5 != 0) {
                        spannableStringBuilder.setSpan(new StyleSpan(i5), i4, i3, 33);
                    }
                    if (armp2.f && a2 != null) {
                        spannableStringBuilder.setSpan(a2.a(), i4, i3, 33);
                    }
                    if (armp2.e) {
                        spannableStringBuilder.setSpan(new ajqp(), i4, i3, 33);
                    }
                    if (armp2.g) {
                        spannableStringBuilder.setSpan(new ajqs(), i4, i3, 33);
                    }
                    i5 = armp2.i;
                    if (i5 != 0) {
                        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i5), null), i4, i3, 33);
                    }
                    if (context2 != null) {
                        Typeface a3;
                        i5 = armj.a(armp2.j);
                        if (i5 == 0) {
                            i5 = 1;
                        }
                        i5--;
                        if (i5 == 1) {
                            a3 = ajrc.YTSANS_MEDIUM.a(context2);
                        } else if (i5 != 2) {
                            a3 = null;
                        } else {
                            a3 = ajrc.ROBOTO_MEDIUM.a(context2);
                        }
                        if (a3 != null) {
                            spannableStringBuilder.setSpan(new ajqu(a3), i4, i3, 33);
                        }
                    }
                    if (!(ajqr2 == null || (armp2.a & 256) == 0)) {
                        apxu apxu = armp2.k;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        spannableStringBuilder.setSpan(ajqr2.a(apxu), i4, i3, 33);
                    }
                    i4 = i3;
                }
            }
        }
        if (i != 0) {
            Linkify.addLinks(spannableStringBuilder, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            while (i2 < length) {
                Object obj = uRLSpanArr[i2];
                int spanStart = spannableStringBuilder.getSpanStart(obj);
                a = spannableStringBuilder.getSpanEnd(obj);
                spannableStringBuilder.removeSpan(obj);
                spannableStringBuilder.setSpan(new ajqz(obj.getURL()), spanStart, a, 33);
                i2++;
            }
        }
        return spannableStringBuilder;
    }

    public static Spanned a(byte[] bArr) {
        try {
            return ajqy.a((arml) anxl.parseFrom(arml.f, bArr, anxa.c()));
        } catch (anyg unused) {
            return null;
        }
    }

    public static CharSequence[] a(arml[] armlArr) {
        if (armlArr != null) {
            int length = armlArr.length;
            if (length != 0) {
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i = 0; i < armlArr.length; i++) {
                    charSequenceArr[i] = ajqy.a(armlArr[i]);
                }
                return charSequenceArr;
            }
        }
        return b;
    }

    public static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Arrays.asList(b);
        }
        ArrayList arrayList = new ArrayList();
        for (arml a : list) {
            arrayList.add(ajqy.a(a));
        }
        return arrayList;
    }

    public static Spanned[] b(arml[] armlArr) {
        Spanned[] spannedArr = new Spanned[armlArr.length];
        for (int i = 0; i < armlArr.length; i++) {
            spannedArr[i] = ajqy.a(armlArr[i]);
        }
        return spannedArr;
    }

    public static Spanned[] b(List list) {
        Spanned[] spannedArr = new Spanned[list.size()];
        for (int i = 0; i < list.size(); i++) {
            spannedArr[i] = ajqy.a((arml) list.get(i));
        }
        return spannedArr;
    }

    public static CharSequence b(arml arml) {
        if (arml != null) {
            armn armn = arml.e;
            if (armn == null) {
                armn = armn.c;
            }
            if ((armn.a & 1) != 0) {
                armn armn2 = arml.e;
                if (armn2 == null) {
                    armn2 = armn.c;
                }
                aodv aodv = armn2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return null;
    }

    public static arml a(long j) {
        armk armk = (armk) arml.f.createBuilder();
        armo armo = (armo) armp.m.createBuilder();
        armo.a(NumberFormat.getInstance().format(j));
        armk.a(armo);
        return (arml) ((anxl) armk.build());
    }

    public static arml a(String str) {
        armk armk = (armk) arml.f.createBuilder();
        armk.a(ajqy.b(str));
        return (arml) ((anxl) armk.build());
    }

    public static arml a(String... strArr) {
        armk armk = (armk) arml.f.createBuilder();
        int length = strArr.length;
        for (int i = 0; i < length; i = 1) {
            armo armo = (armo) armp.m.createBuilder();
            armo.a(ajqy.b(strArr[0]));
            armk.a(armo);
        }
        return (arml) ((anxl) armk.build());
    }

    public static CharSequence a(CharSequence charSequence, List list) {
        return ajqy.a(charSequence, (CharSequence[]) list.toArray(new CharSequence[list.size()]));
    }

    public static CharSequence a(CharSequence charSequence, CharSequence... charSequenceArr) {
        CharSequence charSequence2 = "";
        if (charSequenceArr == null) {
            return charSequence2;
        }
        if (r1 <= 0) {
            return charSequence2;
        }
        if (charSequence == null) {
            charSequence = a;
        }
        CharSequence charSequence3 = charSequence2;
        for (CharSequence charSequence4 : charSequenceArr) {
            if (!TextUtils.isEmpty(charSequence4)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = charSequence4;
                } else {
                    charSequence3 = TextUtils.concat(new CharSequence[]{charSequence3, charSequence, charSequence4});
                }
            }
        }
        return charSequence3;
    }

    public static Intent a(Context context, Intent intent) {
        String str = intent.getPackage();
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            String str2 = "is_loopback";
            if (str == null) {
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                    if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                        intent.putExtra(str2, true);
                        intent.setPackage(packageName);
                        break;
                    }
                }
            } else if (packageName.equals(str)) {
                intent.putExtra(str2, true);
            }
        }
        return intent;
    }
}
