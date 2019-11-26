package defpackage;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bamk */
public final class bamk {
    private static Logger a = Logger.getLogger(bamk.class.getName());
    private static Map b = new HashMap();

    public static bama a(int i, ByteBuffer byteBuffer) {
        bama bamp;
        int d = cio.d(byteBuffer);
        Map map = (Map) b.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) b.get(Integer.valueOf(-1));
        }
        Class cls = (Class) map.get(Integer.valueOf(d));
        String str = " and tag ";
        Logger logger;
        Level level;
        String valueOf;
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            logger = a;
            level = Level.WARNING;
            String toHexString = Integer.toHexString(i);
            String toHexString2 = Integer.toHexString(d);
            valueOf = String.valueOf(cls);
            int length = String.valueOf(toHexString).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 68) + String.valueOf(toHexString2).length()) + valueOf.length());
            stringBuilder.append("No ObjectDescriptor found for objectTypeIndication ");
            stringBuilder.append(toHexString);
            stringBuilder.append(str);
            stringBuilder.append(toHexString2);
            stringBuilder.append(" found: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", stringBuilder.toString());
            bamp = new bamp();
        } else {
            try {
                bamp = (bama) cls.newInstance();
            } catch (Exception e) {
                logger = a;
                level = Level.SEVERE;
                valueOf = String.valueOf(cls);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 99);
                stringBuilder2.append("Couldn't instantiate BaseDescriptor class ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" for objectTypeIndication ");
                stringBuilder2.append(i);
                stringBuilder2.append(str);
                stringBuilder2.append(d);
                logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", stringBuilder2.toString(), e);
                throw new RuntimeException(e);
            }
        }
        bamp.a = d;
        i = cio.d(byteBuffer);
        bamp.b = i & 127;
        int i2 = 1;
        while ((i >>> 7) == 1) {
            i = cio.d(byteBuffer);
            i2++;
            bamp.b = (bamp.b << 7) | (i & 127);
        }
        bamp.c = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(bamp.b);
        bamp.a(slice);
        byteBuffer.position(byteBuffer.position() + bamp.b);
        return bamp;
    }

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(bame.class);
        hashSet.add(bamm.class);
        hashSet.add(bama.class);
        hashSet.add(bamj.class);
        hashSet.add(baml.class);
        hashSet.add(bamn.class);
        hashSet.add(bamb.class);
        hashSet.add(bami.class);
        hashSet.add(bamg.class);
        hashSet.add(bamf.class);
        for (Class cls : hashSet) {
            bamh bamh = (bamh) cls.getAnnotation(bamh.class);
            int[] a = bamh.a();
            int b = bamh.b();
            Map map = (Map) b.get(Integer.valueOf(b));
            if (map == null) {
                map = new HashMap();
            }
            for (int valueOf : a) {
                map.put(Integer.valueOf(valueOf), cls);
            }
            b.put(Integer.valueOf(b), map);
        }
    }
}
