package defpackage;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: xae */
final class xae implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ xaf b;

    xae(xaf xaf, Runnable runnable) {
        this.b = xaf;
        this.a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.b.a);
        Thread currentThread = Thread.currentThread();
        String str = this.b.b;
        String str2 = null;
        if (!(currentThread == null || TextUtils.isEmpty(str))) {
            String name = currentThread.getName();
            if (name != null) {
                int indexOf = name.indexOf("-thread-");
                if (name.startsWith("pool-") && indexOf >= 0) {
                    int i = indexOf + 8;
                    if (i < name.length()) {
                        str2 = name.substring(5, indexOf);
                        name = name.substring(i);
                        indexOf = String.valueOf(str).length();
                        StringBuilder stringBuilder = new StringBuilder(((indexOf + 1) + String.valueOf(str2).length()) + String.valueOf(name).length());
                        stringBuilder.append(str);
                        stringBuilder.append(str2);
                        stringBuilder.append("-");
                        stringBuilder.append(name);
                        str2 = stringBuilder.toString();
                    }
                }
            }
        }
        if (str2 != null) {
            currentThread.setName(str2);
        }
        this.a.run();
    }
}
