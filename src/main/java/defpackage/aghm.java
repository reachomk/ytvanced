package defpackage;

import android.database.Cursor;
import java.security.Key;

/* renamed from: aghm */
final class aghm {
    public final Key a;
    public final Cursor b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;

    aghm(Key key, Cursor cursor) {
        this.a = key;
        this.b = cursor;
        this.c = cursor.getColumnIndexOrThrow("video_id");
        this.d = cursor.getColumnIndexOrThrow("format_stream_proto");
        this.e = cursor.getColumnIndexOrThrow("duration_millis");
        this.f = cursor.getColumnIndexOrThrow("audio_only");
        this.g = cursor.getColumnIndexOrThrow("bytes_transferred");
        this.h = cursor.getColumnIndexOrThrow("stream_status");
        this.i = cursor.getColumnIndexOrThrow("stream_status_timestamp");
        this.j = cursor.getColumnIndexOrThrow("transfer_started_timestamp");
        this.k = cursor.getColumnIndexOrThrow("transfer_completed_timestamp");
        this.l = cursor.getColumnIndexOrThrow("storage_format");
        this.m = cursor.getColumnIndexOrThrow("wrapped_key");
        this.n = cursor.getColumnIndexOrThrow("disco_key_iv");
        this.o = cursor.getColumnIndexOrThrow("disco_key");
        this.p = cursor.getColumnIndexOrThrow("disco_nonce_text");
        this.q = cursor.getColumnIndexOrThrow("encryption_key_type");
        this.r = cursor.getColumnIndexOrThrow("ytb_uri");
        this.s = cursor.getColumnIndexOrThrow("storage_id");
        this.t = cursor.getColumnIndexOrThrow("expired_stream");
    }
}
