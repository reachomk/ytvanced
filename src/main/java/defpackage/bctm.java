package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bctm */
public final class bctm implements bctk {
    private final String a;
    private final ClassLoader b;
    private final Map c;

    public bctm(String str) {
        if (!str.endsWith("/")) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + 1);
            stringBuilder.append(str);
            stringBuilder.append('/');
            str = stringBuilder.toString();
        }
        this.a = str;
        this.b = getClass().getClassLoader();
        InputStream b = b("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(b);
        try {
            bctm.a(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(bcpt.a));
            this.c = concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final bcpt a(String str) {
        if (str != null) {
            Object obj = this.c.get(str);
            if (obj != null) {
                if (str.equals(obj)) {
                    return c(str);
                }
                if (!(obj instanceof SoftReference)) {
                    return a((String) obj);
                }
                bcpt bcpt = (bcpt) ((SoftReference) obj).get();
                return bcpt == null ? c(str) : bcpt;
            }
        }
        return null;
    }

    public final Set a() {
        return new TreeSet(this.c.keySet());
    }

    private final InputStream b(String str) {
        InputStream resourceAsStream;
        str = this.a.concat(str);
        ClassLoader classLoader = this.b;
        if (classLoader != null) {
            resourceAsStream = classLoader.getResourceAsStream(str);
        } else {
            resourceAsStream = ClassLoader.getSystemResourceAsStream(str);
        }
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Resource not found: \"");
        stringBuilder.append(str);
        stringBuilder.append("\" ClassLoader: ");
        ClassLoader classLoader2 = this.b;
        stringBuilder.append(classLoader2 != null ? classLoader2.toString() : "system");
        throw new IOException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A:{SYNTHETIC, Splitter:B:23:0x0045} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A:{SYNTHETIC, Splitter:B:28:0x004b} */
    private final defpackage.bcpt c(java.lang.String r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.b(r6);	 Catch:{ IOException -> 0x0031, all -> 0x002e }
        r2 = r1 instanceof java.io.DataInput;	 Catch:{ IOException -> 0x002c }
        if (r2 == 0) goto L_0x0011;
    L_0x0009:
        r2 = r1;
        r2 = (java.io.DataInput) r2;	 Catch:{ IOException -> 0x002c }
        r2 = defpackage.bctc.a(r2, r6);	 Catch:{ IOException -> 0x002c }
        goto L_0x001a;
    L_0x0011:
        r2 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x002c }
        r2.<init>(r1);	 Catch:{ IOException -> 0x002c }
        r2 = defpackage.bctc.a(r2, r6);	 Catch:{ IOException -> 0x002c }
    L_0x001a:
        r3 = r5.c;	 Catch:{ IOException -> 0x002c }
        r4 = new java.lang.ref.SoftReference;	 Catch:{ IOException -> 0x002c }
        r4.<init>(r2);	 Catch:{ IOException -> 0x002c }
        r3.put(r6, r4);	 Catch:{ IOException -> 0x002c }
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1.close();	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        return r2;
    L_0x002a:
        r6 = move-exception;
        goto L_0x0049;
    L_0x002c:
        r2 = move-exception;
        goto L_0x0033;
    L_0x002e:
        r6 = move-exception;
        r1 = r0;
        goto L_0x0049;
    L_0x0031:
        r2 = move-exception;
        r1 = r0;
    L_0x0033:
        r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x002a }
        r4 = r3.getThreadGroup();	 Catch:{ all -> 0x002a }
        r4.uncaughtException(r3, r2);	 Catch:{ all -> 0x002a }
        r2 = r5.c;	 Catch:{ all -> 0x002a }
        r2.remove(r6);	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0048;
    L_0x0045:
        r1.close();	 Catch:{ IOException -> 0x0048 }
    L_0x0048:
        return r0;
    L_0x0049:
        if (r1 == 0) goto L_0x004e;
    L_0x004b:
        r1.close();	 Catch:{ IOException -> 0x004e }
    L_0x004e:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bctm.c(java.lang.String):bcpt");
    }

    private static void a(DataInputStream dataInputStream, Map map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        readUnsignedShort = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }
}
