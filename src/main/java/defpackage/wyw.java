package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: wyw */
public final class wyw extends wyt {
    protected wyw(File file) {
        super(file);
    }

    public static wyt a(String str) {
        amqd amqd = wyz.a;
        if (amqu.a(str)) {
            return wyu.c();
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            try {
                file.mkdirs();
            } catch (Exception unused) {
            }
        }
        return file.isDirectory() ? (wyt) amqd.a(file) : wyu.c();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj, BufferedOutputStream bufferedOutputStream) {
        Throwable th;
        Serializable serializable = (Serializable) obj;
        OutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                wyt.a(objectOutputStream);
            } catch (Throwable th2) {
                th = th2;
                wyt.a(objectOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            wyt.a(objectOutputStream);
            throw th;
        }
    }
}
