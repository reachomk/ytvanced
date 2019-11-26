package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: die */
public final class die implements ThreadFactory {
    private final String a;
    private int b;

    public die(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append("-");
        stringBuilder.append(i);
        return new Thread(runnable, stringBuilder.toString());
    }
}
