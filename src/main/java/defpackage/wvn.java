package defpackage;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: wvn */
final class wvn {
    public final Executor a;

    wvn(Executor executor) {
        this.a = executor;
    }

    public final void a(File file) {
        try {
            if (file.isDirectory()) {
                for (File a : file.listFiles()) {
                    a(a);
                }
            }
            file.delete();
        } catch (Exception e) {
            String valueOf = String.valueOf(file.getPath());
            String str = "Error attempting to delete ";
            xtl.a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), e);
        }
    }
}
