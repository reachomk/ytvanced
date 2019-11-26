package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: qud */
public final class qud extends qtx {
    private final Object d = new Object();
    private String e;
    private Object f;
    private final /* synthetic */ quf g;

    public qud(quk quk, String str, Object obj, quf quf) {
        this.g = quf;
        super(quk, str, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(String str) {
        try {
            Object a;
            synchronized (this.d) {
                if (!str.equals(this.e)) {
                    a = this.g.a(Base64.decode(str, 3));
                    this.e = str;
                    this.f = a;
                }
                a = this.f;
            }
            return a;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(str).length());
            stringBuilder.append("Invalid byte[] value for ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            Log.e("PhenotypeFlag", stringBuilder.toString());
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(SharedPreferences sharedPreferences) {
        try {
            return a(sharedPreferences.getString(this.b, ""));
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.b);
            String str = "Invalid byte[] value in SharedPreferences for ";
            Log.e("PhenotypeFlag", valueOf.length() == 0 ? new String(str) : str.concat(valueOf), e);
            return null;
        }
    }
}
