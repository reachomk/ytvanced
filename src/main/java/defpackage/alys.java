package defpackage;

/* renamed from: alys */
public final class alys {
    private final int a;

    public alys(zzf zzf) {
        this.a = zzf.j().G;
    }

    public final void a(String str, Throwable th) {
        if (a()) {
            afpf afpf = afpf.upload;
            String str2 = "youtubeUploadService:: ";
            str = String.valueOf(str);
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            afpc.a(1, afpf, str, th);
        }
        xtl.b("youtubeUploadService:: Upload Exception", th);
    }

    public final void a(String str) {
        String str2 = "youtubeUploadService:: ";
        if (a()) {
            afpf afpf = afpf.upload;
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            afpc.a(1, afpf, valueOf);
        }
        str = String.valueOf(str);
        xtl.d(str.length() == 0 ? new String(str2) : str2.concat(str));
    }

    private final boolean a() {
        if (this.a != 0) {
            double random = Math.random();
            double d = (double) this.a;
            Double.isNaN(d);
            if (Math.floor(random * d) == 0.0d) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str, Throwable th, int i) {
        String valueOf = String.valueOf(i == 0 ? "null" : amek.b(i));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 13) + valueOf.length());
        stringBuilder.append(str);
        stringBuilder.append(" UploadType: ");
        stringBuilder.append(valueOf);
        a(stringBuilder.toString(), th);
    }
}
