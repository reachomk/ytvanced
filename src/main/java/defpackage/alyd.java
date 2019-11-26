package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

/* renamed from: alyd */
public final class alyd {
    public static final String[] a = new String[]{"_id", "mime_type", "duration", "latitude", "longitude", "_size"};
    public final ContentResolver b;
    public final alyt c;

    public alyd(Context context, alyt alyt) {
        this.c = alyt;
        this.b = context.getContentResolver();
    }

    public static defpackage.aytx a(android.content.Intent r5) {
        /*
        r0 = r5.getAction();
        if (r0 == 0) goto L_0x006f;
    L_0x0006:
        r1 = r0.hashCode();
        r2 = 3;
        r3 = 2;
        r4 = 1;
        switch(r1) {
            case -1173264947: goto L_0x002f;
            case -58484670: goto L_0x0025;
            case 895964971: goto L_0x001b;
            case 1004674969: goto L_0x0011;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x0039;
    L_0x0011:
        r1 = "com.google.android.youtube.intent.action.UPLOAD";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0039;
    L_0x0019:
        r0 = 1;
        goto L_0x003a;
    L_0x001b:
        r1 = "com.google.android.youtube.intent.action.INTERNAL_UPLOAD";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0039;
    L_0x0023:
        r0 = 0;
        goto L_0x003a;
    L_0x0025:
        r1 = "android.intent.action.SEND_MULTIPLE";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0039;
    L_0x002d:
        r0 = 3;
        goto L_0x003a;
    L_0x002f:
        r1 = "android.intent.action.SEND";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0039;
    L_0x0037:
        r0 = 2;
        goto L_0x003a;
    L_0x0039:
        r0 = -1;
    L_0x003a:
        r1 = "com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source";
        if (r0 == 0) goto L_0x0061;
    L_0x003e:
        if (r0 == r4) goto L_0x0047;
    L_0x0040:
        if (r0 == r3) goto L_0x0047;
    L_0x0042:
        if (r0 == r2) goto L_0x0047;
    L_0x0044:
        r5 = defpackage.aytx.UPLOAD_FLOW_SOURCE_UNKNOWN;
        return r5;
    L_0x0047:
        r0 = 5;
        r5 = r5.getIntExtra(r1, r0);
        r0 = defpackage.aytx.a(r5);
        if (r0 != 0) goto L_0x0054;
    L_0x0052:
        r0 = defpackage.aytx.UPLOAD_FLOW_SOURCE_EXTERNAL;
    L_0x0054:
        r1 = 64;
        if (r5 < r1) goto L_0x005e;
    L_0x0058:
        r1 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r5 <= r1) goto L_0x005d;
    L_0x005c:
        goto L_0x005e;
    L_0x005d:
        return r0;
    L_0x005e:
        r5 = defpackage.aytx.UPLOAD_FLOW_SOURCE_EXTERNAL;
        return r5;
    L_0x0061:
        r0 = 4;
        r5 = r5.getIntExtra(r1, r0);
        r5 = defpackage.aytx.a(r5);
        if (r5 != 0) goto L_0x006e;
    L_0x006c:
        r5 = defpackage.aytx.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL;
    L_0x006e:
        return r5;
    L_0x006f:
        r5 = defpackage.aytx.UPLOAD_FLOW_SOURCE_UNKNOWN;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alyd.a(android.content.Intent):aytx");
    }

    public static Long a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? Long.valueOf(cursor.getLong(columnIndex)) : null;
    }

    public static String b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            return null;
        }
        return cursor.getString(columnIndex);
    }
}
