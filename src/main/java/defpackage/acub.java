package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* renamed from: acub */
public final class acub implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ actz b;

    public acub(actz actz) {
        this.b = actz;
    }

    public final void run() {
        actz actz = this.b;
        boolean z = this.a;
        String str = "LastCrashException";
        Throwable th = null;
        String string = ((SharedPreferences) actz.d.get()).getString(str, null);
        if (string != null) {
            int i = 0;
            try {
                th = (Throwable) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string, 0))).readObject();
            } catch (IOException | ClassNotFoundException unused) {
                String str2 = actz.a;
                StringBuilder stringBuilder = new StringBuilder(string.length() + 35);
                stringBuilder.append("Failed to deserialize throwable. [");
                stringBuilder.append(string);
                stringBuilder.append("]");
                xtl.a(str2, stringBuilder.toString());
            }
            if (!(z || th == null)) {
                String canonicalName = th.getClass().getCanonicalName();
                if (th.getMessage() != null) {
                    i = th.getMessage().hashCode();
                }
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(canonicalName).length() + 41);
                stringBuilder2.append("<message stripped: ");
                stringBuilder2.append(canonicalName);
                stringBuilder2.append(" hashCode=");
                stringBuilder2.append(i);
                stringBuilder2.append(">");
                Throwable exception = new Exception(stringBuilder2.toString(), th.getCause());
                exception.setStackTrace(th.getStackTrace());
                th = exception;
            }
        }
        if (th != null) {
            xtl.c(actz.a, "Sending Crash from last run...", th);
            afpc.a(2, afpf.crash, th.getMessage(), th);
        }
        ((SharedPreferences) this.b.d.get()).edit().remove(str).apply();
    }
}
