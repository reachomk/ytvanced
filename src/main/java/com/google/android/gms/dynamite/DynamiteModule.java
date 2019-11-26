package com.google.android.gms.dynamite;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import defpackage.psh;
import defpackage.pzr;
import defpackage.qcz;
import defpackage.qda;
import defpackage.qdb;
import defpackage.qdc;
import defpackage.qdd;
import defpackage.qde;
import defpackage.qdf;
import defpackage.qdg;
import defpackage.qdh;
import defpackage.qdi;
import defpackage.qdk;
import defpackage.qdm;
import defpackage.qdn;
import defpackage.qdp;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final qcz a = new qdd();
    public static final qcz b = new qde();
    private static Boolean c;
    private static qdk d;
    private static qdm e;
    private static String f;
    private static final ThreadLocal g = new ThreadLocal();
    private static final qdi h = new qdb();
    private final Context i;

    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX WARNING: Missing block: B:8:0x0033, code skipped:
            if (r3.a != 0) goto L_0x0035;
     */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r9, defpackage.qcz r10, java.lang.String r11) {
        /*
        r0 = com.google.android.gms.dynamite.DynamiteModule.class;
        r1 = g;
        r1 = r1.get();
        r1 = (defpackage.qcy) r1;
        r2 = new qcy;
        r3 = 0;
        r2.<init>(r3);
        r3 = g;
        r3.set(r2);
        r3 = h;	 Catch:{ all -> 0x01bc }
        r3 = r10.a(r9, r11, r3);	 Catch:{ all -> 0x01bc }
        r4 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x01bc }
        r4.length();	 Catch:{ all -> 0x01bc }
        r4 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x01bc }
        r4.length();	 Catch:{ all -> 0x01bc }
        r4 = r3.c;	 Catch:{ all -> 0x01bc }
        if (r4 == 0) goto L_0x0192;
    L_0x002d:
        r5 = -1;
        if (r4 == r5) goto L_0x0031;
    L_0x0030:
        goto L_0x0035;
    L_0x0031:
        r6 = r3.a;	 Catch:{ all -> 0x01bc }
        if (r6 == 0) goto L_0x0192;
    L_0x0035:
        r6 = 1;
        if (r4 != r6) goto L_0x003c;
    L_0x0038:
        r7 = r3.b;	 Catch:{ all -> 0x01bc }
        if (r7 == 0) goto L_0x0192;
    L_0x003c:
        if (r4 != r5) goto L_0x004f;
    L_0x003e:
        r9 = b(r9, r11);	 Catch:{ all -> 0x01bc }
        r10 = r2.a;
        if (r10 == 0) goto L_0x0049;
    L_0x0046:
        r10.close();
    L_0x0049:
        r10 = g;
        r10.set(r1);
        return r9;
    L_0x004f:
        if (r4 != r6) goto L_0x0179;
    L_0x0051:
        r4 = r3.b;	 Catch:{ qda -> 0x012f }
        monitor-enter(r0);	 Catch:{ qda -> 0x012f }
        r6 = c;	 Catch:{ all -> 0x012c }
        monitor-exit(r0);	 Catch:{ all -> 0x012c }
        if (r6 == 0) goto L_0x0124;
    L_0x0059:
        r6 = r6.booleanValue();	 Catch:{ qda -> 0x012f }
        if (r6 != 0) goto L_0x00a0;
    L_0x005f:
        r0 = java.lang.String.valueOf(r11);	 Catch:{ qda -> 0x012f }
        r0.length();	 Catch:{ qda -> 0x012f }
        r0 = a(r9);	 Catch:{ qda -> 0x012f }
        if (r0 == 0) goto L_0x0098;
    L_0x006c:
        r6 = defpackage.qct.a(r9);	 Catch:{ RemoteException -> 0x008f }
        r0 = r0.a(r6, r11, r4);	 Catch:{ RemoteException -> 0x008f }
        r4 = defpackage.qct.a(r0);	 Catch:{ qda -> 0x012f }
        if (r4 == 0) goto L_0x0087;
    L_0x007a:
        r4 = new com.google.android.gms.dynamite.DynamiteModule;	 Catch:{ qda -> 0x012f }
        r0 = defpackage.qct.a(r0);	 Catch:{ qda -> 0x012f }
        r0 = (android.content.Context) r0;	 Catch:{ qda -> 0x012f }
        r4.<init>(r0);	 Catch:{ qda -> 0x012f }
        goto L_0x00fc;
    L_0x0087:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "Failed to load remote module.";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x008f:
        r0 = move-exception;
        r4 = new qda;	 Catch:{ qda -> 0x012f }
        r6 = "Failed to load remote module.";
        r4.<init>(r6, r0);	 Catch:{ qda -> 0x012f }
        throw r4;	 Catch:{ qda -> 0x012f }
    L_0x0098:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "Failed to create IDynamiteLoader.";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x00a0:
        r6 = java.lang.String.valueOf(r11);	 Catch:{ qda -> 0x012f }
        r6.length();	 Catch:{ qda -> 0x012f }
        monitor-enter(r0);	 Catch:{ qda -> 0x012f }
        r6 = e;	 Catch:{ all -> 0x0121 }
        monitor-exit(r0);	 Catch:{ all -> 0x0121 }
        if (r6 == 0) goto L_0x0119;
    L_0x00ad:
        r0 = g;	 Catch:{ qda -> 0x012f }
        r0 = r0.get();	 Catch:{ qda -> 0x012f }
        r0 = (defpackage.qcy) r0;	 Catch:{ qda -> 0x012f }
        if (r0 == 0) goto L_0x0111;
    L_0x00b7:
        r7 = r0.a;	 Catch:{ qda -> 0x012f }
        if (r7 == 0) goto L_0x0111;
    L_0x00bb:
        r7 = r9.getApplicationContext();	 Catch:{ qda -> 0x012f }
        r0 = r0.a;	 Catch:{ qda -> 0x012f }
        r7 = defpackage.qct.a(r7);	 Catch:{ Exception -> 0x00d4 }
        r0 = defpackage.qct.a(r0);	 Catch:{ Exception -> 0x00d4 }
        r0 = r6.a(r7, r11, r4, r0);	 Catch:{ Exception -> 0x00d4 }
        r0 = defpackage.qct.a(r0);	 Catch:{ Exception -> 0x00d4 }
        r0 = (android.content.Context) r0;	 Catch:{ Exception -> 0x00d4 }
        goto L_0x00f5;
    L_0x00d4:
        r0 = move-exception;
        r4 = "DynamiteModule";
        r6 = "Failed to load DynamiteLoader: ";
        r0 = r0.toString();	 Catch:{ qda -> 0x012f }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ qda -> 0x012f }
        r7 = r0.length();	 Catch:{ qda -> 0x012f }
        if (r7 != 0) goto L_0x00ed;
    L_0x00e7:
        r0 = new java.lang.String;	 Catch:{ qda -> 0x012f }
        r0.<init>(r6);	 Catch:{ qda -> 0x012f }
        goto L_0x00f1;
    L_0x00ed:
        r0 = r6.concat(r0);	 Catch:{ qda -> 0x012f }
    L_0x00f1:
        android.util.Log.e(r4, r0);	 Catch:{ qda -> 0x012f }
        r0 = 0;
    L_0x00f5:
        if (r0 == 0) goto L_0x0109;
    L_0x00f7:
        r4 = new com.google.android.gms.dynamite.DynamiteModule;	 Catch:{ qda -> 0x012f }
        r4.<init>(r0);	 Catch:{ qda -> 0x012f }
    L_0x00fc:
        r9 = r2.a;
        if (r9 == 0) goto L_0x0103;
    L_0x0100:
        r9.close();
    L_0x0103:
        r9 = g;
        r9.set(r1);
        return r4;
    L_0x0109:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "Failed to get module context";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x0111:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "No result cursor";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x0119:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "DynamiteLoaderV2 was not cached.";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x0121:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0121 }
        throw r4;	 Catch:{ qda -> 0x012f }
    L_0x0124:
        r0 = new qda;	 Catch:{ qda -> 0x012f }
        r4 = "Failed to determine which loading route to use.";
        r0.<init>(r4);	 Catch:{ qda -> 0x012f }
        throw r0;	 Catch:{ qda -> 0x012f }
    L_0x012c:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x012c }
        throw r4;	 Catch:{ qda -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        r4 = "DynamiteModule";
        r6 = "Failed to load remote module: ";
        r7 = r0.getMessage();	 Catch:{ all -> 0x01bc }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x01bc }
        r8 = r7.length();	 Catch:{ all -> 0x01bc }
        if (r8 != 0) goto L_0x0148;
    L_0x0142:
        r7 = new java.lang.String;	 Catch:{ all -> 0x01bc }
        r7.<init>(r6);	 Catch:{ all -> 0x01bc }
        goto L_0x014c;
    L_0x0148:
        r7 = r6.concat(r7);	 Catch:{ all -> 0x01bc }
    L_0x014c:
        android.util.Log.w(r4, r7);	 Catch:{ all -> 0x01bc }
        r3 = r3.a;	 Catch:{ all -> 0x01bc }
        if (r3 == 0) goto L_0x0171;
    L_0x0153:
        r4 = new qcx;	 Catch:{ all -> 0x01bc }
        r4.<init>(r3);	 Catch:{ all -> 0x01bc }
        r10 = r10.a(r9, r11, r4);	 Catch:{ all -> 0x01bc }
        r10 = r10.c;	 Catch:{ all -> 0x01bc }
        if (r10 != r5) goto L_0x0171;
    L_0x0160:
        r9 = b(r9, r11);	 Catch:{ all -> 0x01bc }
        r10 = r2.a;
        if (r10 == 0) goto L_0x016b;
    L_0x0168:
        r10.close();
    L_0x016b:
        r10 = g;
        r10.set(r1);
        return r9;
    L_0x0171:
        r9 = new qda;	 Catch:{ all -> 0x01bc }
        r10 = "Remote load failed. No local fallback found.";
        r9.<init>(r10, r0);	 Catch:{ all -> 0x01bc }
        throw r9;	 Catch:{ all -> 0x01bc }
    L_0x0179:
        r9 = new qda;	 Catch:{ all -> 0x01bc }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01bc }
        r11 = 47;
        r10.<init>(r11);	 Catch:{ all -> 0x01bc }
        r11 = "VersionPolicy returned invalid code:";
        r10.append(r11);	 Catch:{ all -> 0x01bc }
        r10.append(r4);	 Catch:{ all -> 0x01bc }
        r10 = r10.toString();	 Catch:{ all -> 0x01bc }
        r9.<init>(r10);	 Catch:{ all -> 0x01bc }
        throw r9;	 Catch:{ all -> 0x01bc }
    L_0x0192:
        r9 = new qda;	 Catch:{ all -> 0x01bc }
        r10 = r3.a;	 Catch:{ all -> 0x01bc }
        r11 = r3.b;	 Catch:{ all -> 0x01bc }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01bc }
        r3 = 91;
        r0.<init>(r3);	 Catch:{ all -> 0x01bc }
        r3 = "No acceptable module found. Local version is ";
        r0.append(r3);	 Catch:{ all -> 0x01bc }
        r0.append(r10);	 Catch:{ all -> 0x01bc }
        r10 = " and remote version is ";
        r0.append(r10);	 Catch:{ all -> 0x01bc }
        r0.append(r11);	 Catch:{ all -> 0x01bc }
        r10 = ".";
        r0.append(r10);	 Catch:{ all -> 0x01bc }
        r10 = r0.toString();	 Catch:{ all -> 0x01bc }
        r9.<init>(r10);	 Catch:{ all -> 0x01bc }
        throw r9;	 Catch:{ all -> 0x01bc }
    L_0x01bc:
        r9 = move-exception;
        r10 = r2.a;
        if (r10 == 0) goto L_0x01c4;
    L_0x01c1:
        r10.close();
    L_0x01c4:
        r10 = g;
        r10.set(r1);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, qcz, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    public static int a(Context context, String str) {
        String str2 = "DynamiteModule";
        String valueOf;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("com.google.android.gms.dynamite.descriptors.");
            stringBuilder.append(str);
            stringBuilder.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(stringBuilder.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            stringBuilder = new StringBuilder((valueOf.length() + 51) + String.valueOf(str).length());
            stringBuilder.append("Module descriptor id '");
            stringBuilder.append(valueOf);
            stringBuilder.append("' didn't match expected id '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            Log.e(str2, stringBuilder.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder2.append("Local module descriptor class for ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not found.");
            Log.w(str2, stringBuilder2.toString());
            return 0;
        } catch (Exception e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Failed to load module descriptor class: ";
            Log.e(str2, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be A:{SYNTHETIC, Splitter:B:54:0x00be} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00be A:{SYNTHETIC, Splitter:B:54:0x00be} */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006f */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|38|39|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:32|33|41|42|50|51|52|(0)(0)) */
    /* JADX WARNING: Missing block: B:33:?, code skipped:
            r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
            r2 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing block: B:42:0x0088, code skipped:
            r1 = r2;
     */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        r0 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x0114 }
        if (r1 != 0) goto L_0x00b6;
    L_0x0007:
        r1 = r8.getApplicationContext();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class;
        r2 = r2.getName();	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r2 = "sClassLoader";
        r2 = r1.getDeclaredField(r2);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        monitor-enter(r1);	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
        r3 = 0;
        r4 = r2.get(r3);	 Catch:{ all -> 0x008a }
        r4 = (java.lang.ClassLoader) r4;	 Catch:{ all -> 0x008a }
        if (r4 != 0) goto L_0x0079;
    L_0x0029:
        r4 = "com.google.android.gms";
        r5 = r8.getApplicationContext();	 Catch:{ all -> 0x008a }
        r5 = r5.getPackageName();	 Catch:{ all -> 0x008a }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x0043;
    L_0x0039:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        r2.set(r3, r4);	 Catch:{ all -> 0x008a }
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0043:
        r4 = b(r8, r9, r10);	 Catch:{ qda -> 0x006f }
        r5 = f;	 Catch:{ qda -> 0x006f }
        if (r5 == 0) goto L_0x006c;
    L_0x004b:
        r5 = f;	 Catch:{ qda -> 0x006f }
        r5 = r5.isEmpty();	 Catch:{ qda -> 0x006f }
        if (r5 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x006c;
    L_0x0054:
        r5 = new qdj;	 Catch:{ qda -> 0x006f }
        r6 = f;	 Catch:{ qda -> 0x006f }
        r7 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ qda -> 0x006f }
        r5.<init>(r6, r7);	 Catch:{ qda -> 0x006f }
        a(r5);	 Catch:{ qda -> 0x006f }
        r2.set(r3, r5);	 Catch:{ qda -> 0x006f }
        r5 = java.lang.Boolean.TRUE;	 Catch:{ qda -> 0x006f }
        c = r5;	 Catch:{ qda -> 0x006f }
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        return r4;
    L_0x006c:
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        return r4;
    L_0x006f:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        r2.set(r3, r4);	 Catch:{ all -> 0x008a }
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0079:
        r2 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x008a }
        if (r4 != r2) goto L_0x0082;
    L_0x007f:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x008a }
        goto L_0x0087;
    L_0x0082:
        a(r4);	 Catch:{ qda -> 0x0085 }
    L_0x0085:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x008a }
    L_0x0087:
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        r1 = r2;
        goto L_0x00b4;
    L_0x008a:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        throw r2;	 Catch:{ ClassNotFoundException -> 0x0091, IllegalAccessException -> 0x008f, ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008d }
    L_0x008d:
        r1 = move-exception;
        goto L_0x0092;
    L_0x008f:
        r1 = move-exception;
        goto L_0x0092;
    L_0x0091:
        r1 = move-exception;
    L_0x0092:
        r2 = "DynamiteModule";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0114 }
        r3 = r1.length();	 Catch:{ all -> 0x0114 }
        r3 = r3 + 30;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0114 }
        r4.<init>(r3);	 Catch:{ all -> 0x0114 }
        r3 = "Failed to load module via V2: ";
        r4.append(r3);	 Catch:{ all -> 0x0114 }
        r4.append(r1);	 Catch:{ all -> 0x0114 }
        r1 = r4.toString();	 Catch:{ all -> 0x0114 }
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x0114 }
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0114 }
    L_0x00b4:
        c = r1;	 Catch:{ all -> 0x0114 }
    L_0x00b6:
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        r0 = r1.booleanValue();
        r1 = 0;
        if (r0 == 0) goto L_0x00e4;
    L_0x00be:
        r8 = b(r8, r9, r10);	 Catch:{ qda -> 0x00c3 }
        return r8;
    L_0x00c3:
        r8 = move-exception;
        r8 = r8.getMessage();
        r8 = java.lang.String.valueOf(r8);
        r9 = "Failed to retrieve remote module version: ";
        r10 = r8.length();
        if (r10 != 0) goto L_0x00da;
    L_0x00d4:
        r8 = new java.lang.String;
        r8.<init>(r9);
        goto L_0x00de;
    L_0x00da:
        r8 = r9.concat(r8);
    L_0x00de:
        r9 = "DynamiteModule";
        android.util.Log.w(r9, r8);
        return r1;
    L_0x00e4:
        r0 = a(r8);
        if (r0 == 0) goto L_0x0113;
    L_0x00ea:
        r8 = defpackage.qct.a(r8);	 Catch:{ RemoteException -> 0x00f3 }
        r1 = r0.a(r8, r9, r10);	 Catch:{ RemoteException -> 0x00f3 }
        goto L_0x0113;
    L_0x00f3:
        r8 = move-exception;
        r8 = r8.getMessage();
        r8 = java.lang.String.valueOf(r8);
        r9 = "Failed to retrieve remote module version: ";
        r10 = r8.length();
        if (r10 != 0) goto L_0x010a;
    L_0x0104:
        r8 = new java.lang.String;
        r8.<init>(r9);
        goto L_0x010e;
    L_0x010a:
        r8 = r9.concat(r8);
    L_0x010e:
        r9 = "DynamiteModule";
        android.util.Log.w(r9, r8);
    L_0x0113:
        return r1;
    L_0x0114:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0114 }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x009f  */
    private static int b(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
        r0 = 0;
        r1 = r7.getContentResolver();	 Catch:{ Exception -> 0x008d }
        if (r9 != 0) goto L_0x000a;
    L_0x0007:
        r7 = "api";
        goto L_0x000c;
    L_0x000a:
        r7 = "api_force_staging";
    L_0x000c:
        r9 = r7.length();	 Catch:{ Exception -> 0x008d }
        r9 = r9 + 42;
        r2 = java.lang.String.valueOf(r8);	 Catch:{ Exception -> 0x008d }
        r2 = r2.length();	 Catch:{ Exception -> 0x008d }
        r9 = r9 + r2;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008d }
        r2.<init>(r9);	 Catch:{ Exception -> 0x008d }
        r9 = "content://com.google.android.gms.chimera/";
        r2.append(r9);	 Catch:{ Exception -> 0x008d }
        r2.append(r7);	 Catch:{ Exception -> 0x008d }
        r7 = "/";
        r2.append(r7);	 Catch:{ Exception -> 0x008d }
        r2.append(r8);	 Catch:{ Exception -> 0x008d }
        r7 = r2.toString();	 Catch:{ Exception -> 0x008d }
        r2 = android.net.Uri.parse(r7);	 Catch:{ Exception -> 0x008d }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x008d }
        if (r7 == 0) goto L_0x0075;
    L_0x0042:
        r8 = r7.moveToFirst();	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        if (r8 == 0) goto L_0x0075;
    L_0x0048:
        r8 = 0;
        r8 = r7.getInt(r8);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        if (r8 <= 0) goto L_0x006f;
    L_0x004f:
        r9 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r9);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r1 = 2;
        r1 = r7.getString(r1);	 Catch:{ all -> 0x006c }
        f = r1;	 Catch:{ all -> 0x006c }
        monitor-exit(r9);	 Catch:{ all -> 0x006c }
        r9 = g;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r9 = r9.get();	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r9 = (defpackage.qcy) r9;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        if (r9 == 0) goto L_0x006f;
    L_0x0064:
        r1 = r9.a;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        if (r1 != 0) goto L_0x006f;
    L_0x0068:
        r9.a = r7;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r7 = r0;
        goto L_0x006f;
    L_0x006c:
        r8 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x006c }
        throw r8;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
    L_0x006f:
        if (r7 == 0) goto L_0x0074;
    L_0x0071:
        r7.close();
    L_0x0074:
        return r8;
    L_0x0075:
        r8 = "DynamiteModule";
        r9 = "Failed to retrieve remote module version.";
        android.util.Log.w(r8, r9);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r8 = new qda;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        r9 = "Failed to connect to dynamite module ContentResolver.";
        r8.<init>(r9);	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
        throw r8;	 Catch:{ Exception -> 0x0087, all -> 0x0084 }
    L_0x0084:
        r8 = move-exception;
        r0 = r7;
        goto L_0x009d;
    L_0x0087:
        r8 = move-exception;
        r0 = r7;
        goto L_0x008f;
    L_0x008a:
        r7 = move-exception;
        r8 = r7;
        goto L_0x009d;
    L_0x008d:
        r7 = move-exception;
        r8 = r7;
        r7 = r8 instanceof defpackage.qda;	 Catch:{ all -> 0x008a }
        if (r7 != 0) goto L_0x009c;
    L_0x0094:
        r7 = new qda;	 Catch:{ all -> 0x008a }
        r9 = "V2 version check failed";
        r7.<init>(r9, r8);	 Catch:{ all -> 0x008a }
        throw r7;	 Catch:{ all -> 0x008a }
    L_0x009c:
        throw r8;	 Catch:{ all -> 0x008a }
    L_0x009d:
        if (r0 == 0) goto L_0x00a2;
    L_0x009f:
        r0.close();
    L_0x00a2:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.b(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule b(Context context, String str) {
        str = String.valueOf(str);
        String str2 = "Selected local version of ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static qdk a(Context context) {
        synchronized (DynamiteModule.class) {
            qdk qdk;
            if (d != null) {
                qdk = d;
                return qdk;
            } else if (psh.d.c(context) == 0) {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        qdk = queryLocalInterface instanceof qdk ? (qdk) queryLocalInterface : new qdn(iBinder);
                    } else {
                        qdk = null;
                    }
                    if (qdk != null) {
                        d = qdk;
                        return qdk;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                }
            } else {
                return null;
            }
        }
        return null;
    }

    private static void a(ClassLoader classLoader) {
        try {
            qdm qdp;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                qdp = queryLocalInterface instanceof qdm ? (qdm) queryLocalInterface : new qdp(iBinder);
            } else {
                qdp = null;
            }
            e = qdp;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new qda("Failed to instantiate dynamite loader", e);
        }
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.i.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            str = String.valueOf(str);
            String str2 = "Failed to instantiate module class: ";
            throw new qda(str.length() == 0 ? new String(str2) : str2.concat(str), e);
        }
    }

    private DynamiteModule(Context context) {
        this.i = (Context) pzr.a((Object) context);
    }

    static {
        qdc qdc = new qdc();
        qdf qdf = new qdf();
        qdh qdh = new qdh();
        qdg qdg = new qdg();
    }
}
