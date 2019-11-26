package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcelable.Creator;
import android.provider.MediaStore.Audio.Media;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: zer */
public final class zer extends zev {
    public static final Creator CREATOR = new zeu();
    private static final String[] c = new String[]{"title", "artist", "duration", "_id", "album_id", "mime_type"};
    private static final Set d = new HashSet(Arrays.asList(new String[]{"audio/aac-adts", "audio/aac", "audio/x-aac", "audio/vnd.dlna.adts", "audio/flac", "application/ogg", "audio/ogg", "audio/wav", "audio/x-wav", "audio/wave", "audio/x-pn-wav"}));

    public zer(CharSequence charSequence) {
        super(charSequence, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A:{Catch:{ all -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A:{Catch:{ all -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A:{SKIP, Catch:{ all -> 0x00ea }} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A:{Catch:{ all -> 0x00ea }} */
    public final java.util.List a(android.content.Context r17) {
        /*
        r16 = this;
        r0 = r17;
        r1 = defpackage.zer.b(r17);
        r2 = new java.util.ArrayList;
        r3 = r1.getCount();
        r2.<init>(r3);
        r3 = new java.util.HashMap;
        r3.<init>();
    L_0x0014:
        r4 = r1.moveToNext();	 Catch:{ all -> 0x00ea }
        if (r4 == 0) goto L_0x00e6;
    L_0x001a:
        r4 = defpackage.zer.a(r1);	 Catch:{ all -> 0x00ea }
        if (r4 == 0) goto L_0x0014;
    L_0x0020:
        r4 = 0;
        r5 = r1.getString(r4);	 Catch:{ all -> 0x00ea }
        r6 = 1;
        r7 = r1.getString(r6);	 Catch:{ all -> 0x00ea }
        r8 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x00ea }
        r9 = "<unknown>";
        if (r8 != 0) goto L_0x003b;
    L_0x0032:
        r8 = r9.equals(r5);	 Catch:{ all -> 0x00ea }
        if (r8 == 0) goto L_0x0039;
    L_0x0038:
        goto L_0x003b;
    L_0x0039:
        r8 = 0;
        goto L_0x003c;
    L_0x003b:
        r8 = 1;
    L_0x003c:
        r10 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x00ea }
        if (r10 != 0) goto L_0x004b;
    L_0x0042:
        r9 = r9.equals(r7);	 Catch:{ all -> 0x00ea }
        if (r9 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r9 = 0;
        goto L_0x004c;
    L_0x004b:
        r9 = 1;
    L_0x004c:
        if (r8 == 0) goto L_0x0077;
    L_0x004e:
        if (r9 != 0) goto L_0x0077;
    L_0x0050:
        r5 = r3.get(r7);	 Catch:{ all -> 0x00ea }
        if (r5 == 0) goto L_0x0061;
    L_0x0056:
        r5 = r3.get(r7);	 Catch:{ all -> 0x00ea }
        r5 = (java.lang.Integer) r5;	 Catch:{ all -> 0x00ea }
        r5 = r5.intValue();	 Catch:{ all -> 0x00ea }
        goto L_0x0062;
    L_0x0061:
        r5 = 0;
    L_0x0062:
        r8 = new java.lang.Object[r6];	 Catch:{ all -> 0x00ea }
        r5 = r5 + r6;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x00ea }
        r8[r4] = r5;	 Catch:{ all -> 0x00ea }
        r4 = 2131953072; // 0x7f1305b0 float:1.9542605E38 double:1.0533247714E-314;
        r4 = r0.getString(r4, r8);	 Catch:{ all -> 0x00ea }
        r3.put(r7, r5);	 Catch:{ all -> 0x00ea }
        r5 = r4;
        goto L_0x0082;
    L_0x0077:
        if (r8 == 0) goto L_0x0082;
    L_0x0079:
        if (r9 == 0) goto L_0x0082;
    L_0x007b:
        r4 = 2131953071; // 0x7f1305af float:1.9542603E38 double:1.053324771E-314;
        r5 = r0.getString(r4);	 Catch:{ all -> 0x00ea }
    L_0x0082:
        if (r9 == 0) goto L_0x008b;
    L_0x0084:
        r4 = 2131953070; // 0x7f1305ae float:1.95426E38 double:1.0533247704E-314;
        r7 = r0.getString(r4);	 Catch:{ all -> 0x00ea }
    L_0x008b:
        r9 = new android.text.SpannableString;	 Catch:{ all -> 0x00ea }
        r9.<init>(r5);	 Catch:{ all -> 0x00ea }
        r10 = new android.text.SpannableString;	 Catch:{ all -> 0x00ea }
        r10.<init>(r7);	 Catch:{ all -> 0x00ea }
        r4 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;	 Catch:{ all -> 0x00ea }
        r5 = 3;
        r5 = r1.getInt(r5);	 Catch:{ all -> 0x00ea }
        r5 = (long) r5;	 Catch:{ all -> 0x00ea }
        r12 = android.content.ContentUris.withAppendedId(r4, r5);	 Catch:{ all -> 0x00ea }
        r4 = defpackage.aygk.f;	 Catch:{ all -> 0x00ea }
        r4 = r4.createBuilder();	 Catch:{ all -> 0x00ea }
        r4 = (defpackage.aygj) r4;	 Catch:{ all -> 0x00ea }
        r5 = defpackage.aygm.e;	 Catch:{ all -> 0x00ea }
        r5 = r5.createBuilder();	 Catch:{ all -> 0x00ea }
        r5 = (defpackage.aygl) r5;	 Catch:{ all -> 0x00ea }
        r6 = "content://media/external/audio/albumart";
        r6 = android.net.Uri.parse(r6);	 Catch:{ all -> 0x00ea }
        r7 = 4;
        r7 = r1.getInt(r7);	 Catch:{ all -> 0x00ea }
        r7 = (long) r7;	 Catch:{ all -> 0x00ea }
        r6 = android.content.ContentUris.withAppendedId(r6, r7);	 Catch:{ all -> 0x00ea }
        r6 = r6.toString();	 Catch:{ all -> 0x00ea }
        r5.a(r6);	 Catch:{ all -> 0x00ea }
        r4.a(r5);	 Catch:{ all -> 0x00ea }
        r4 = r4.build();	 Catch:{ all -> 0x00ea }
        r4 = (defpackage.anxl) r4;	 Catch:{ all -> 0x00ea }
        r13 = r4;
        r13 = (defpackage.aygk) r13;	 Catch:{ all -> 0x00ea }
        r4 = new zet;	 Catch:{ all -> 0x00ea }
        r5 = 2;
        r11 = r1.getInt(r5);	 Catch:{ all -> 0x00ea }
        r14 = 0;
        r15 = 0;
        r8 = r4;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x00ea }
        r2.add(r4);	 Catch:{ all -> 0x00ea }
        goto L_0x0014;
    L_0x00e6:
        r1.close();
        return r2;
    L_0x00ea:
        r0 = move-exception;
        r1.close();
        goto L_0x00f0;
    L_0x00ef:
        throw r0;
    L_0x00f0:
        goto L_0x00ef;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zer.a(android.content.Context):java.util.List");
    }

    public static boolean a(Cursor cursor) {
        int i = cursor.getInt(2);
        String string = cursor.getString(5);
        boolean z = false;
        if (i > 0) {
            if (string == null) {
                z = true;
            } else if (d.contains(string.toLowerCase(Locale.ENGLISH))) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public static Cursor b(Context context) {
        amqw.a((Object) context);
        return context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, c, "is_music != 0", null, "title");
    }
}
