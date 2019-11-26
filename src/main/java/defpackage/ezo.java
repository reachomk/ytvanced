package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: ezo */
public final class ezo {
    private int a = 0;
    private int b = 0;

    public static ezo a(int i) {
        ezo ezo = new ezo();
        ezo.a = i;
        return ezo;
    }

    public static ezo b(int i) {
        ezo ezo = new ezo();
        ezo.b = i;
        return ezo;
    }

    public final String toString() {
        String toHexString = Integer.toHexString(this.a);
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 26);
        stringBuilder.append("color 0x");
        stringBuilder.append(toHexString);
        stringBuilder.append(" attr  ");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public final int a(Context context) {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        return xwe.a(context, i, 0);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("hex_color", this.a);
        bundle.putInt("attribute_color", this.b);
        return bundle;
    }

    public static int a(Context context, Bundle bundle) {
        ezo ezo = new ezo();
        ezo.a = bundle.getInt("hex_color", 0);
        ezo.b = bundle.getInt("attribute_color", 0);
        return ezo.a(context);
    }
}
