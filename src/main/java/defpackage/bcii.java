package defpackage;

import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bcii */
public final class bcii extends ThreadPoolExecutor {
    private static final int a = Runtime.getRuntime().availableProcessors();
    private static final int b = Math.max(2, Math.min(a - 1, 4));
    private static final int c;
    private static final ThreadFactory d = new bcil();
    private static final BlockingQueue e = new ArrayBlockingQueue(128);

    public bcii() {
        super(b, c, 30, TimeUnit.SECONDS, e, d);
        allowCoreThreadTimeOut(true);
    }

    private static String a(Runnable runnable) {
        Class cls = runnable.getClass();
        try {
            if (cls == bcij.class) {
                Object obj = null;
                cls = obj.getClass();
            } else if (cls.getEnclosingClass() == AsyncTask.class) {
                Field declaredField = cls.getDeclaredField("this$0");
                declaredField.setAccessible(true);
                cls = declaredField.get(runnable).getClass();
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return cls.getName();
    }

    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            String str;
            HashMap hashMap = new HashMap();
            for (Runnable a : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                String a2 = bcii.a(a);
                hashMap.put(a2, Integer.valueOf((hashMap.containsKey(a2) ? ((Integer) hashMap.get(a2)).intValue() : 0) + 1));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Prominent classes in AsyncTask: ");
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    stringBuilder2.append((String) entry.getKey());
                    stringBuilder2.append(' ');
                }
            }
            if (stringBuilder2.length() == 0) {
                str = "NO CLASSES FOUND";
            } else {
                str = stringBuilder2.toString();
            }
            stringBuilder.append(str);
            throw new RejectedExecutionException(stringBuilder.toString(), e);
        }
    }

    static {
        int i = a;
        c = (i + i) + 1;
    }
}
