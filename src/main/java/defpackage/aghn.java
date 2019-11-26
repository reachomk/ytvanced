package defpackage;

import android.content.ContentValues;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aghn */
public final class aghn {
    public static final String[] a = new String[]{"video_id", "itag", "format_stream_proto", "duration_millis", "audio_only", "bytes_transferred", "bytes_total", "stream_status", "stream_status_timestamp", "transfer_added_timestamp", "transfer_started_timestamp", "transfer_completed_timestamp", "storage_format", "wrapped_key", "disco_key_iv", "disco_key", "disco_nonce_text", "encryption_key_type", "external_yt_file_path", "storage_id", "expired_stream", "ytb_uri"};
    public final Key b;
    public final agfd c;
    public final agfp d;
    private final List e = new ArrayList();

    public aghn(Key key, agfd agfd, agfp agfp) {
        this.b = key;
        this.c = agfd;
        this.d = agfp;
    }

    public final void a(aghq aghq) {
        this.e.add(aghq);
    }

    public final void a(String str, boolean z) {
        String str2 = "video_id = ?";
        try {
            int i = 1;
            String[] strArr = new String[i];
            int i2 = 0;
            strArr[i2] = str;
            this.c.a().delete("streams", str2, strArr);
            agfp agfp = this.d;
            try {
                String[] strArr2 = new String[i];
                strArr2[i2] = str;
                agfp.b.a().delete("hashes", str2, strArr2);
            } finally {
                agfp agfp2 = agfp;
                for (agfs a : agfp.c) {
                    a.a();
                }
            }
        } finally {
            for (aghq a2 : this.e) {
                a2.a(str, z);
            }
        }
    }

    public final ContentValues a(agql agql) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", agql.q());
        contentValues.put("itag", Integer.valueOf(agql.r()));
        contentValues.put("format_stream_proto", agql.a().a.toByteArray());
        contentValues.put("duration_millis", Long.valueOf(agql.a().c));
        contentValues.put("audio_only", xbs.a(agql.b()));
        contentValues.put("bytes_total", Long.valueOf(agql.t()));
        contentValues.put("bytes_transferred", Long.valueOf(agql.c()));
        contentValues.put("stream_status", Integer.valueOf(agql.d()));
        contentValues.put("stream_status_timestamp", Long.valueOf(agql.e()));
        contentValues.put("transfer_started_timestamp", Long.valueOf(agql.f()));
        contentValues.put("transfer_completed_timestamp", Long.valueOf(agql.g()));
        int p = agql.p();
        int i = p - 1;
        String str = null;
        if (p != 0) {
            contentValues.put("storage_format", Integer.valueOf(i));
            contentValues.put("wrapped_key", agql.h());
            contentValues.put("disco_key_iv", agql.i());
            byte[] toByteArray = agql.j() != null ? agql.j().toByteArray() : null;
            if (agql.i() == null || toByteArray == null || toByteArray.length <= 0) {
                toByteArray = null;
            } else {
                toByteArray = xsf.a(agql.i(), toByteArray, this.b);
            }
            contentValues.put("disco_key", toByteArray);
            contentValues.put("disco_nonce_text", agql.k() != null ? agql.k().getBytes(ampv.c) : null);
            contentValues.put("encryption_key_type", Integer.valueOf(agql.l()));
            if (agql.o() != null) {
                str = agql.o().toString();
            }
            contentValues.put("ytb_uri", str);
            contentValues.put("storage_id", agql.m());
            contentValues.put("expired_stream", xbs.a(agql.n()));
            return contentValues;
        }
        throw null;
    }
}
