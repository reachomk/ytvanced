package defpackage;

import android.util.Log;

/* renamed from: ueh */
final class ueh extends uee {
    ueh(ueg ueg, String str, Boolean bool) {
        super(ueg, str, bool);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String str;
        if (obj instanceof String) {
            str = (String) obj;
            if (rzt.b.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (rzt.c.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        str = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 28) + valueOf.length());
        stringBuilder.append("Invalid boolean value for ");
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(valueOf);
        Log.e("PhenotypeFlag", stringBuilder.toString());
        return null;
    }
}
