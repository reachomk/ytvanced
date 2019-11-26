package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: ucz */
public final class ucz {
    public final SharedPreferences a;

    public ucz(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final anze a(String str, anzq anzq) {
        byte[] decode = Base64.decode(this.a.getString(str, ""), 0);
        String str2 = "PersistStorage";
        if (decode != null) {
            int length = decode.length;
            if (length != 0) {
                if (decode[0] != (byte) 1) {
                    tyv.d(str2, "wrong header", new Object[0]);
                } else {
                    try {
                        return (anze) anzq.a(decode, length - 1);
                    } catch (anyg e) {
                        tyv.b(str2, "failure reading proto", e, new Object[0]);
                    }
                }
                return null;
            }
        }
        tyv.d(str2, "unknown key", new Object[0]);
        return null;
    }

    public final boolean a(String str, anze anze) {
        byte[] toByteArray = ((anze) uhy.a((Object) anze)).toByteArray();
        int length = toByteArray.length;
        byte[] bArr = new byte[(length + 1)];
        bArr[0] = (byte) 1;
        System.arraycopy(toByteArray, 0, bArr, 1, length);
        return this.a.edit().putString(str, Base64.encodeToString(bArr, 0)).commit();
    }
}
