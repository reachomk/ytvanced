package defpackage;

/* renamed from: qus */
public final class qus {
    public static qze a(String str, String str2, String str3) {
        qzd qzd = (qzd) ((ret) qze.zzrzs.a(5));
        qzd.b();
        ((qze) qzd.a).zzrzo = str2;
        str2 = String.valueOf(str3);
        String str4 = "type.googleapis.com/google.crypto.tink.";
        str2 = str2.length() == 0 ? new String(str4) : str4.concat(str2);
        qzd.b();
        qze qze = (qze) qzd.a;
        if (str2 != null) {
            qze.zzryv = str2;
            qzd.b();
            ((qze) qzd.a).zzrzp = 0;
            qzd.b();
            ((qze) qzd.a).zzrzq = true;
            qzd.b();
            ((qze) qzd.a).zzrzr = str;
            return (qze) qzd.f();
        }
        throw new NullPointerException();
    }
}
