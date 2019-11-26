package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: mj */
public final class mj {
    public static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* JADX WARNING: Missing block: B:16:0x003e, code skipped:
            r0.skipBytes(2);
            r0.skipBytes(2);
            r0.skipBytes(2);
            r0.skipBytes(2);
            r14 = new defpackage.mn();
            r14.b = ((long) java.lang.Integer.reverseBytes(r0.readInt())) & 4294967295L;
            r14.a = ((long) java.lang.Integer.reverseBytes(r0.readInt())) & 4294967295L;
            r1 = new java.util.zip.CRC32();
            r5 = r14.b;
            r0.seek(r14.a);
            r2 = new byte[16384];
            r14 = r0.read(r2, 0, (int) java.lang.Math.min(16384, r5));
     */
    /* JADX WARNING: Missing block: B:18:0x008a, code skipped:
            if (r14 == -1) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:19:0x008c, code skipped:
            r1.update(r2, 0, r14);
            r5 = r5 - ((long) r14);
     */
    /* JADX WARNING: Missing block: B:20:0x0093, code skipped:
            if (r5 == 0) goto L_0x009f;
     */
    /* JADX WARNING: Missing block: B:21:0x0095, code skipped:
            r14 = r0.read(r2, 0, (int) java.lang.Math.min(16384, r5));
     */
    /* JADX WARNING: Missing block: B:22:0x009f, code skipped:
            r1 = r1.getValue();
     */
    public static long b(java.io.File r14) {
        /*
        r0 = new java.io.RandomAccessFile;
        r1 = "r";
        r0.<init>(r14, r1);
        r1 = r0.length();	 Catch:{ all -> 0x00c7 }
        r3 = -22;
        r1 = r1 + r3;
        r3 = 0;
        r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r14 < 0) goto L_0x00ac;
    L_0x0014:
        r5 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r5 = r5 + r1;
        r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r14 < 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001e;
    L_0x001d:
        r5 = r3;
    L_0x001e:
        r14 = 101010256; // 0x6054b50 float:2.506985E-35 double:4.99056974E-316;
        r14 = java.lang.Integer.reverseBytes(r14);	 Catch:{ all -> 0x00c7 }
    L_0x0025:
        r0.seek(r1);	 Catch:{ all -> 0x00c7 }
        r7 = r0.readInt();	 Catch:{ all -> 0x00c7 }
        r8 = -1;
        if (r7 == r14) goto L_0x003e;
    L_0x0030:
        r1 = r1 + r8;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 < 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0025;
    L_0x0036:
        r14 = new java.util.zip.ZipException;	 Catch:{ all -> 0x00c7 }
        r1 = "End Of Central Directory signature not found";
        r14.<init>(r1);	 Catch:{ all -> 0x00c7 }
        throw r14;	 Catch:{ all -> 0x00c7 }
    L_0x003e:
        r14 = 2;
        r0.skipBytes(r14);	 Catch:{ all -> 0x00c7 }
        r0.skipBytes(r14);	 Catch:{ all -> 0x00c7 }
        r0.skipBytes(r14);	 Catch:{ all -> 0x00c7 }
        r0.skipBytes(r14);	 Catch:{ all -> 0x00c7 }
        r14 = new mn;	 Catch:{ all -> 0x00c7 }
        r14.<init>();	 Catch:{ all -> 0x00c7 }
        r1 = r0.readInt();	 Catch:{ all -> 0x00c7 }
        r1 = java.lang.Integer.reverseBytes(r1);	 Catch:{ all -> 0x00c7 }
        r1 = (long) r1;	 Catch:{ all -> 0x00c7 }
        r5 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r1 = r1 & r5;
        r14.b = r1;	 Catch:{ all -> 0x00c7 }
        r1 = r0.readInt();	 Catch:{ all -> 0x00c7 }
        r1 = java.lang.Integer.reverseBytes(r1);	 Catch:{ all -> 0x00c7 }
        r1 = (long) r1;	 Catch:{ all -> 0x00c7 }
        r1 = r1 & r5;
        r14.a = r1;	 Catch:{ all -> 0x00c7 }
        r1 = new java.util.zip.CRC32;	 Catch:{ all -> 0x00c7 }
        r1.<init>();	 Catch:{ all -> 0x00c7 }
        r5 = r14.b;	 Catch:{ all -> 0x00c7 }
        r10 = r14.a;	 Catch:{ all -> 0x00c7 }
        r0.seek(r10);	 Catch:{ all -> 0x00c7 }
        r10 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r12 = java.lang.Math.min(r10, r5);	 Catch:{ all -> 0x00c7 }
        r14 = (int) r12;	 Catch:{ all -> 0x00c7 }
        r2 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r2 = new byte[r2];	 Catch:{ all -> 0x00c7 }
        r7 = 0;
        r14 = r0.read(r2, r7, r14);	 Catch:{ all -> 0x00c7 }
    L_0x0089:
        r12 = -1;
        if (r14 == r12) goto L_0x009f;
    L_0x008c:
        r1.update(r2, r7, r14);	 Catch:{ all -> 0x00c7 }
        r12 = (long) r14;	 Catch:{ all -> 0x00c7 }
        r5 = r5 - r12;
        r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r14 == 0) goto L_0x009f;
    L_0x0095:
        r12 = java.lang.Math.min(r10, r5);	 Catch:{ all -> 0x00c7 }
        r14 = (int) r12;	 Catch:{ all -> 0x00c7 }
        r14 = r0.read(r2, r7, r14);	 Catch:{ all -> 0x00c7 }
        goto L_0x0089;
    L_0x009f:
        r1 = r1.getValue();	 Catch:{ all -> 0x00c7 }
        r0.close();
        r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r14 != 0) goto L_0x00ab;
    L_0x00aa:
        r1 = r1 + r8;
    L_0x00ab:
        return r1;
    L_0x00ac:
        r14 = new java.util.zip.ZipException;	 Catch:{ all -> 0x00c7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c7 }
        r1.<init>();	 Catch:{ all -> 0x00c7 }
        r2 = "File too short to be a zip file: ";
        r1.append(r2);	 Catch:{ all -> 0x00c7 }
        r2 = r0.length();	 Catch:{ all -> 0x00c7 }
        r1.append(r2);	 Catch:{ all -> 0x00c7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00c7 }
        r14.<init>(r1);	 Catch:{ all -> 0x00c7 }
        throw r14;	 Catch:{ all -> 0x00c7 }
    L_0x00c7:
        r14 = move-exception;
        r0.close();
        goto L_0x00cd;
    L_0x00cc:
        throw r14;
    L_0x00cd:
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.b(java.io.File):long");
    }

    public static List a(File file, File file2) {
        int read;
        Throwable th;
        StringBuilder stringBuilder;
        Throwable th2;
        File file3 = file2;
        String str = ".zip";
        String str2 = ".dex";
        String str3 = "Failed to close resource";
        String str4 = "classes";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(file.getName());
        stringBuilder2.append(".classes");
        String stringBuilder3 = stringBuilder2.toString();
        File[] listFiles = file3.listFiles(new mm(stringBuilder3));
        String str5 = "MultiDex";
        if (listFiles == null) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to list secondary dex dir content (");
            stringBuilder2.append(file2.getPath());
            stringBuilder2.append(").");
            Log.w(str5, stringBuilder2.toString());
        } else {
            for (File file4 : listFiles) {
                file4.getPath();
                file4.length();
                if (file4.delete()) {
                    file4.getPath();
                } else {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("Failed to delete old file ");
                    stringBuilder4.append(file4.getPath());
                    Log.w(str5, stringBuilder4.toString());
                }
            }
        }
        List arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        ZipFile fileOutputStream;
        try {
            List list;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            stringBuilder2.append(2);
            stringBuilder2.append(str2);
            ZipEntry entry = zipFile.getEntry(stringBuilder2.toString());
            int i = 2;
            while (entry != null) {
                String str6;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(stringBuilder3);
                stringBuilder2.append(i);
                stringBuilder2.append(str);
                ml mlVar = new ml(file3, stringBuilder2.toString());
                arrayList.add(mlVar);
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Extraction is needed for file ");
                stringBuilder2.append(mlVar);
                stringBuilder2.toString();
                int i2 = 0;
                Object obj = null;
                while (i2 < 3) {
                    if (obj != null) {
                        break;
                    }
                    int i3 = i2 + 1;
                    Closeable inputStream = zipFile.getInputStream(entry);
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("tmp-");
                    stringBuilder2.append(stringBuilder3);
                    File createTempFile = File.createTempFile(stringBuilder2.toString(), str, mlVar.getParentFile());
                    createTempFile.getPath();
                    try {
                        ZipEntry zipEntry;
                        str6 = str;
                        fileOutputStream = new FileOutputStream(createTempFile);
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            zipEntry = new ZipEntry("classes.dex");
                            list = arrayList;
                            fileOutputStream = zipFile;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = zipFile;
                            zipOutputStream.close();
                            throw th;
                        }
                        try {
                            zipEntry.setTime(entry.getTime());
                            zipOutputStream.putNextEntry(zipEntry);
                            byte[] bArr = new byte[16384];
                            for (read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                                zipOutputStream.write(bArr, 0, read);
                            }
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            if (createTempFile.setReadOnly()) {
                                mlVar.getPath();
                                if (createTempFile.renameTo(mlVar)) {
                                    Object obj2;
                                    try {
                                        mj.a(inputStream);
                                        createTempFile.delete();
                                        mlVar.a = mj.b(mlVar);
                                        obj2 = 1;
                                    } catch (IOException e) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append("Failed to read crc from ");
                                        stringBuilder.append(mlVar.getAbsolutePath());
                                        Log.w(str5, stringBuilder.toString(), e);
                                        obj2 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th2 = th;
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException th5) {
                                            Log.w(str5, str3, th5);
                                        }
                                        throw th2;
                                    }
                                    mlVar.getAbsolutePath();
                                    mlVar.length();
                                    if (obj2 == null) {
                                        mlVar.delete();
                                        if (mlVar.exists()) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Failed to delete corrupted secondary dex '");
                                            stringBuilder.append(mlVar.getPath());
                                            stringBuilder.append("'");
                                            Log.w(str5, stringBuilder.toString());
                                        }
                                    }
                                    file3 = file2;
                                    zipFile = fileOutputStream;
                                    str = str6;
                                    arrayList = list;
                                    int i4 = i3;
                                    obj = obj2;
                                    i2 = i4;
                                } else {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failed to rename \"");
                                    stringBuilder.append(createTempFile.getAbsolutePath());
                                    stringBuilder.append("\" to \"");
                                    stringBuilder.append(mlVar.getAbsolutePath());
                                    stringBuilder.append("\"");
                                    throw new IOException(stringBuilder.toString());
                                }
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Failed to mark readonly \"");
                            stringBuilder.append(createTempFile.getAbsolutePath());
                            stringBuilder.append("\" (tmp of \"");
                            stringBuilder.append(mlVar.getAbsolutePath());
                            stringBuilder.append("\")");
                            throw new IOException(stringBuilder.toString());
                        } catch (Throwable th6) {
                            th5 = th6;
                            mj.a(inputStream);
                            createTempFile.delete();
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        th5 = th7;
                        fileOutputStream = zipFile;
                        mj.a(inputStream);
                        createTempFile.delete();
                        throw th5;
                    }
                }
                if (obj == null) {
                    try {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Could not create zip file ");
                        stringBuilder.append(mlVar.getAbsolutePath());
                        stringBuilder.append(" for secondary dex (");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        throw new IOException(stringBuilder.toString());
                    } catch (Throwable th52) {
                        th2 = th52;
                        fileOutputStream = zipFile;
                        fileOutputStream.close();
                        throw th2;
                    }
                }
                str6 = str;
                list = arrayList;
                fileOutputStream = zipFile;
                i++;
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append(i);
                stringBuilder2.append(str2);
                entry = fileOutputStream.getEntry(stringBuilder2.toString());
                file3 = file2;
                zipFile = fileOutputStream;
                str = str6;
                arrayList = list;
            }
            list = arrayList;
            try {
                zipFile.close();
            } catch (IOException th522) {
                Log.w(str5, str3, th522);
            }
            return list;
        } catch (Throwable th8) {
            th522 = th8;
            fileOutputStream = zipFile;
            th2 = th522;
            fileOutputStream.close();
            throw th2;
        }
    }

    public static void a(Context context, long j, long j2, List list) {
        Editor edit = mj.a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        int i = 2;
        for (ml mlVar : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("dex.crc.");
            stringBuilder.append(i);
            edit.putLong(stringBuilder.toString(), mlVar.a);
            stringBuilder = new StringBuilder();
            stringBuilder.append("dex.time.");
            stringBuilder.append(i);
            edit.putLong(stringBuilder.toString(), mlVar.lastModified());
            i++;
        }
        edit.commit();
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
