package defpackage;

import android.database.Cursor;

/* renamed from: agix */
public final class agix {
    public final Cursor a;
    public final aght b;
    public final agiv c;
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

    public agix(agpi agpi, agew agew, Cursor cursor) {
        this.a = cursor;
        this.b = new aght(cursor, agpi, agew);
        this.c = new agiv(cursor);
        this.d = cursor.getColumnIndexOrThrow("preferred_stream_quality");
        this.e = cursor.getColumnIndexOrThrow("offline_source_ve_type");
        this.f = cursor.getColumnIndexOrThrow("player_response_tracking_params");
        this.g = cursor.getColumnIndexOrThrow("saved_timestamp");
        this.h = cursor.getColumnIndexOrThrow("last_refresh_timestamp");
        this.i = cursor.getColumnIndexOrThrow("last_playback_timestamp");
        this.j = cursor.getColumnIndexOrThrow("last_playback_position_timestamp");
        this.k = cursor.getColumnIndexOrThrow("media_status");
        this.l = cursor.getColumnIndexOrThrow("stream_transfer_condition");
        this.m = cursor.getColumnIndexOrThrow("video_added_timestamp");
    }
}
