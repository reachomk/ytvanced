package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acje */
public final class acje implements achr, acir {
    private final acio a;
    private final boolean b;
    private final boolean c;
    private final Uri d;
    private final String e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j = -1;
    private int k = -1;
    private int l = 0;
    private achq m;
    private volatile long n;

    public acje(Context context, Uri uri, String str, achn achn, boolean z, boolean z2, int i, long j) {
        acio acio = new acio(context, uri.getHost(), uri.getPort(), achn, z, z2, i, j);
        amqw.a("rtmp".equals(uri.getScheme()));
        this.b = true;
        this.c = true;
        this.d = uri;
        this.e = str;
        this.a = acio;
        this.a.b = this;
    }

    public final void i() {
    }

    public final void a(achq achq) {
        this.m = achq;
    }

    public final int a(MediaFormat mediaFormat) {
        String str = "RtmpMuxer";
        if (this.g) {
            Log.e(str, "Cannot add a track once started");
            return -1;
        } else if (this.h) {
            Log.e(str, "Cannot add a track once stopped");
            return -1;
        } else if (this.i) {
            Log.e(str, "Cannot add a track after release");
            return -1;
        } else {
            String str2 = "mime";
            acio acio;
            int i;
            if (acej.a(mediaFormat)) {
                if (this.j >= 0) {
                    Log.e(str, "Video track already added");
                    return -1;
                }
                acio = this.a;
                if ("video/avc".equals(mediaFormat.getString(str2))) {
                    acio.c = 7;
                    acio.k = mediaFormat;
                    i = this.l;
                    this.l = i + 1;
                    this.j = i;
                    return i;
                }
                Log.e(str, "Video format not supported by RTMP connection");
                return -1;
            } else if (!acej.b(mediaFormat)) {
                String valueOf = String.valueOf(mediaFormat);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
                stringBuilder.append("Unknown media format type: ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
                return -1;
            } else if (this.k >= 0) {
                Log.e(str, "Audio track already added");
                return -1;
            } else {
                acio = this.a;
                if ("audio/mp4a-latm".equals(mediaFormat.getString(str2))) {
                    acio.d = 10;
                    acio.j = mediaFormat;
                    i = this.l;
                    this.l = i + 1;
                    this.k = i;
                    return i;
                }
                Log.e(str, "Audio format not supported by RTMP connection");
                return -1;
            }
        }
    }

    public final boolean a() {
        boolean z = false;
        if (!(this.i || this.h || (this.c && this.k < 0))) {
            if (this.b) {
                return this.j < 0 ? z : true;
            } else {
                z = true;
            }
        }
    }

    public final boolean b() {
        if (this.i) {
            return true;
        }
        try {
            this.a.f();
            this.i = true;
        } catch (Exception e) {
            Log.e("RtmpMuxer", "Releasing the RTMP connection failed", e);
        }
        return this.i;
    }

    public final int c() {
        String str = "RtmpMuxer";
        if (this.i) {
            Log.e(str, "Cannot prepare once released");
            return 1;
        } else if (this.h) {
            Log.e(str, "Cannot prepare once stopped");
            return 1;
        } else if (this.g) {
            Log.e(str, "Cannot prepare once started");
            return 1;
        } else if (this.f) {
            return 0;
        } else {
            try {
                this.n = 0;
                this.a.a();
                this.f = true;
                return 0;
            } catch (TimeoutException e) {
                Log.e(str, "Connecting to remote host timed out", e);
                return 11;
            } catch (ProtocolException e2) {
                Log.e(str, "RTMP protocol error during initial handshake", e2);
                return 12;
            } catch (IOException e3) {
                Log.e(str, "Connecting to remote host failed due to IO error", e3);
                return 12;
            } catch (InterruptedException e4) {
                Log.e(str, "Connection was interrupted", e4);
                return 12;
            } catch (Exception e5) {
                Log.e(str, "Preparing the RTMP connection failed", e5);
                return 12;
            }
        }
    }

    public final boolean d() {
        String str = "frame-rate";
        String str2 = "sample-rate";
        String str3 = "height";
        String str4 = "width";
        String str5 = "bitrate";
        String str6 = "RtmpMuxer";
        if (this.i) {
            Log.e(str6, "Cannot start once released");
            return false;
        } else if (this.h) {
            Log.e(str6, "Cannot restart once stopped");
            return false;
        } else if (!this.f) {
            Log.e(str6, "Muxer not prepared");
            return false;
        } else if (this.g) {
            return true;
        } else {
            if (a()) {
                try {
                    acio acio = this.a;
                    Uri uri = this.d;
                    String str7 = this.e;
                    String str8 = "Invalid chunk size to set: 8192";
                    if (acio.h) {
                        boolean z;
                        String str9 = "RtmpConnection";
                        if (acio.i) {
                            Log.e(str9, "Stream is already published");
                        } else if (acio.j == null) {
                            throw new IllegalStateException("RTMP audio format is missing");
                        } else if (acio.k != null) {
                            acjh acjh = acio.f;
                            if (acjf.b(8192)) {
                                amqw.a(true);
                                acjh.a.clear();
                                acjh.a(acjh.a, 2, 0, 4, 1, 0);
                                acjh.a.putInt(8192);
                                acjh.a.flip();
                                acjh.b(acjh.a);
                                acjh.f = 8192;
                                ByteBuffer.allocate(8192);
                                acjh.b(4);
                                acio.f.a(10485760, 0);
                                if (acio.g) {
                                    int toMillis = (int) (TimeUnit.SECONDS.toMillis(16384) / 1000);
                                    try {
                                        Socket socket = acio.a.socket();
                                        socket.setSendBufferSize(16384);
                                        socket.setSoTimeout(toMillis);
                                    } catch (Exception e) {
                                        Log.e(str9, "Could not set socket options", e);
                                    }
                                    acio.i = true;
                                } else {
                                    Future b = acio.e.b(1);
                                    acjh acjh2 = acio.f;
                                    if (uri != null) {
                                        String path = uri.getPath();
                                        String str10 = "Target path cannot be empty";
                                        if (TextUtils.isEmpty(path)) {
                                            throw new ProtocolException(str10);
                                        }
                                        while (path.startsWith("/")) {
                                            path = path.substring(1);
                                        }
                                        if (TextUtils.isEmpty(path)) {
                                            throw new ProtocolException(str10);
                                        }
                                        str10 = "Stream key cannot be empty";
                                        if (TextUtils.isEmpty(str7)) {
                                            throw new ProtocolException(str10);
                                        }
                                        acjh2.b.a();
                                        acjh2.b.a("connect");
                                        String str11 = str10;
                                        acjh2.b.a(1.0d);
                                        acjh2.b.a.writeByte(3);
                                        acjh2.b.b("app");
                                        acjh2.b.a(path);
                                        acjh2.b.b("flashVer");
                                        acjh2.b.a(acjh2.i);
                                        acjh2.b.b("flashver");
                                        acjh2.b.a(acjh2.i);
                                        acjh2.b.b("tcUrl");
                                        acjh2.b.a(uri.toString());
                                        acjh2.b.b("type");
                                        acjh2.b.a("nonprivate");
                                        acjh2.b.d();
                                        ByteBuffer b2 = acjh2.b.b();
                                        int limit = b2.limit();
                                        acjh2.a.clear();
                                        acjh.a(acjh2.a, 3, 0, limit, 20, 1);
                                        acjh2.a.flip();
                                        acjh2.b(acjh2.a);
                                        acjh2.b(b2);
                                        acjh2.b(limit);
                                        acjc acjc = (acjc) b.get(5000, TimeUnit.MILLISECONDS);
                                        StringBuilder stringBuilder;
                                        if (acjc.a == 0 && "NetConnection.Connect.Success".equals(acjc.b)) {
                                            acio.e.c(1);
                                            acjh acjh3 = acio.f;
                                            int b3 = acio.b();
                                            if (TextUtils.isEmpty(str7)) {
                                                throw new ProtocolException(str11);
                                            }
                                            acjh3.b.a();
                                            acjh3.b.a("releaseStream");
                                            acjh3.b.a((double) b3);
                                            acjh3.b.c();
                                            acjh3.b.a(str7);
                                            b2 = acjh3.b.b();
                                            limit = b2.limit();
                                            acjh3.a.clear();
                                            acjh.a(acjh3.a, 3, 0, limit, 20, 1);
                                            acjh3.a.flip();
                                            acjh3.b(acjh3.a);
                                            acjh3.b(b2);
                                            acjh3.b(limit);
                                            int b4 = acio.b();
                                            Future b5 = acio.e.b(b4);
                                            acjh acjh4 = acio.f;
                                            acjh4.b.a();
                                            acjh4.b.a("createStream");
                                            acjh4.b.a((double) b4);
                                            acjh4.b.c();
                                            ByteBuffer b6 = acjh4.b.b();
                                            int limit2 = b6.limit();
                                            acjh4.a.clear();
                                            acjh.a(acjh4.a, 3, 0, limit2, 20, 1);
                                            acjh4.a.flip();
                                            acjh4.b(acjh4.a);
                                            acjh4.b(b6);
                                            acjh4.b(limit2);
                                            acjc acjc2 = (acjc) b5.get(5000, TimeUnit.MILLISECONDS);
                                            if (acjc2.a == 0) {
                                                acio.e.c(b4);
                                                b = acio.e.b(2);
                                                acjh4 = acio.f;
                                                if (TextUtils.isEmpty(str7)) {
                                                    throw new ProtocolException(str11);
                                                }
                                                acjh4.b.a();
                                                acjh4.b.a("publish");
                                                acjh4.b.a(2.0d);
                                                acjh4.b.c();
                                                acjh4.b.a(str7);
                                                acjh4.b.a("live");
                                                ByteBuffer b7 = acjh4.b.b();
                                                int limit3 = b7.limit();
                                                acjh4.a.clear();
                                                acjh.a(acjh4.a, 3, 0, limit3, 20, 1);
                                                acjh4.a.flip();
                                                acjh4.b(acjh4.a);
                                                acjh4.b(b7);
                                                acjh4.b(limit3);
                                                acjc = (acjc) b.get(5000, TimeUnit.MILLISECONDS);
                                                if (acjc.a == 0 && "NetStream.Publish.Start".equals(acjc.b)) {
                                                    acio.e.c(2);
                                                    acjh3 = acio.f;
                                                    b3 = acio.d;
                                                    MediaFormat mediaFormat = acio.j;
                                                    int i = acio.c;
                                                    MediaFormat mediaFormat2 = acio.k;
                                                    if (!acej.b(mediaFormat) || !mediaFormat.containsKey(str5) || !mediaFormat.containsKey(str2)) {
                                                        str2 = String.valueOf(mediaFormat);
                                                        stringBuilder = new StringBuilder(str2.length() + 22);
                                                        stringBuilder.append("Invalid audio format: ");
                                                        stringBuilder.append(str2);
                                                        throw new ProtocolException(stringBuilder.toString());
                                                    } else if (acej.a(mediaFormat2) && mediaFormat2.containsKey(str4) && mediaFormat2.containsKey(str3) && mediaFormat2.containsKey(str5) && mediaFormat2.containsKey(str)) {
                                                        acjh3.b.a();
                                                        acjh3.b.a("@setDataFrame");
                                                        acjh3.b.a("onMetaData");
                                                        acin acin = acjh3.b;
                                                        acin.a.writeByte(8);
                                                        acin.a.writeInt(13);
                                                        acjh3.b.b("duration");
                                                        acjh3.b.a(0.0d);
                                                        acjh3.b.b(str4);
                                                        acjh3.b.a((double) mediaFormat2.getInteger(str4));
                                                        acjh3.b.b(str3);
                                                        acjh3.b.a((double) mediaFormat2.getInteger(str3));
                                                        acjh3.b.b("videodatarate");
                                                        acjh3.b.a((double) mediaFormat2.getInteger(str5));
                                                        acjh3.b.b("framerate");
                                                        acjh3.b.a((double) mediaFormat2.getInteger(str));
                                                        acjh3.b.b("videocodecid");
                                                        acjh3.b.a((double) i);
                                                        acjh3.b.b("audiodatarate");
                                                        acjh3.b.a((double) mediaFormat.getInteger(str5));
                                                        acjh3.b.b("audiosamplerate");
                                                        acjh3.b.a((double) mediaFormat.getInteger(str2));
                                                        acjh3.b.b("audiosamplesize");
                                                        acin acin2 = acjh3.b;
                                                        acjf.c(b3);
                                                        acin2.a(16.0d);
                                                        acjh3.b.b("stereo");
                                                        acin2 = acjh3.b;
                                                        acjf.d(b3);
                                                        acin2.a.writeByte(1);
                                                        acin2.a.writeByte(1);
                                                        acjh3.b.b("audiocodecid");
                                                        acjh3.b.a((double) b3);
                                                        acjh3.b.b("encoder");
                                                        acjh3.b.a(acjh3.i);
                                                        acjh3.b.b("filesize");
                                                        acjh3.b.a(0.0d);
                                                        acjh3.b.d();
                                                        ByteBuffer b8 = acjh3.b.b();
                                                        int limit4 = b8.limit();
                                                        acjh3.a.clear();
                                                        acjh.a(acjh3.a, 3, 0, limit4, 18, 1);
                                                        acjh3.a.flip();
                                                        acjh3.b(acjh3.a);
                                                        acjh3.b(b8);
                                                        acjh3.b(limit4);
                                                        z = true;
                                                        acio.i = true;
                                                        this.g = z;
                                                        return this.g;
                                                    } else {
                                                        str2 = String.valueOf(mediaFormat2);
                                                        stringBuilder = new StringBuilder(str2.length() + 22);
                                                        stringBuilder.append("Invalid video format: ");
                                                        stringBuilder.append(str2);
                                                        throw new ProtocolException(stringBuilder.toString());
                                                    }
                                                }
                                                str2 = String.valueOf(acjc);
                                                stringBuilder = new StringBuilder(str2.length() + 36);
                                                stringBuilder.append("RTMP publish request failed: result=");
                                                stringBuilder.append(str2);
                                                throw new ProtocolException(stringBuilder.toString());
                                            }
                                            str2 = String.valueOf(acjc2);
                                            stringBuilder = new StringBuilder(str2.length() + 47);
                                            stringBuilder.append("RTMP NetConnection.createStream failed: result=");
                                            stringBuilder.append(str2);
                                            throw new ProtocolException(stringBuilder.toString());
                                        }
                                        str2 = String.valueOf(acjc);
                                        stringBuilder = new StringBuilder(str2.length() + 34);
                                        stringBuilder.append("RTMP NetConnection failed: result=");
                                        stringBuilder.append(str2);
                                        throw new ProtocolException(stringBuilder.toString());
                                    }
                                    throw new ProtocolException("Target URI cannot be null");
                                }
                            }
                            throw new ProtocolException(str8);
                        } else {
                            throw new IllegalStateException("RTMP video format is missing");
                        }
                        z = true;
                        this.g = z;
                        return this.g;
                    }
                    throw new IllegalStateException("RTMP channel is not connected");
                } catch (Exception e2) {
                    Log.e(str6, "Starting the RTMP connection failed", e2);
                }
            } else {
                Log.e(str6, "Cannot start without all tracks");
                return false;
            }
        }
    }

    public final boolean e() {
        String str = "RtmpMuxer";
        if (this.i) {
            Log.e(str, "Cannot stop once released");
            return false;
        } else if (!this.g) {
            Log.e(str, "Muxer not started");
            return false;
        } else if (this.h) {
            return true;
        } else {
            try {
                this.a.e();
                this.h = true;
            } catch (Exception e) {
                Log.e(str, "Stopping the RTMP connection failed", e);
            }
            return this.h;
        }
    }

    public final boolean f() {
        return (!this.g || this.h || this.i) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169 A:{Catch:{ Exception -> 0x0182 }} */
    public final boolean a(int r23, java.nio.ByteBuffer r24, android.media.MediaCodec.BufferInfo r25) {
        /*
        r22 = this;
        r1 = r22;
        r0 = r23;
        r2 = r25;
        r3 = "csd-1";
        r4 = "csd-0";
        r5 = r1.i;
        r6 = "RtmpMuxer";
        r7 = 0;
        if (r5 == 0) goto L_0x0017;
    L_0x0011:
        r0 = "Cannot write data once released";
        android.util.Log.e(r6, r0);
        return r7;
    L_0x0017:
        r5 = r1.h;
        if (r5 == 0) goto L_0x0021;
    L_0x001b:
        r0 = "Cannot write data once stopped";
        android.util.Log.e(r6, r0);
        return r7;
    L_0x0021:
        r5 = r1.g;
        if (r5 != 0) goto L_0x002b;
    L_0x0025:
        r0 = "Muxer not started";
        android.util.Log.e(r6, r0);
        return r7;
    L_0x002b:
        r5 = r1.a;	 Catch:{ Exception -> 0x0182 }
        r8 = r1.k;	 Catch:{ Exception -> 0x0182 }
        r9 = r5.i;	 Catch:{ Exception -> 0x0182 }
        if (r9 == 0) goto L_0x017a;
    L_0x0033:
        r9 = r5.f;	 Catch:{ Exception -> 0x0182 }
        r15 = r5.d;	 Catch:{ Exception -> 0x0182 }
        r14 = r5.j;	 Catch:{ Exception -> 0x0182 }
        r13 = r5.c;	 Catch:{ Exception -> 0x0182 }
        r10 = r5.k;	 Catch:{ Exception -> 0x0182 }
        r11 = r2.flags;	 Catch:{ Exception -> 0x0182 }
        r11 = r11 & 2;
        r12 = 1;
        if (r11 != 0) goto L_0x0164;
    L_0x0044:
        r11 = r9.j;	 Catch:{ Exception -> 0x0182 }
        r16 = 4;
        if (r11 == 0) goto L_0x00de;
    L_0x004a:
        if (r0 == r8) goto L_0x0164;
    L_0x004c:
        r11 = r2.flags;	 Catch:{ Exception -> 0x0182 }
        r11 = r11 & r12;
        if (r11 == 0) goto L_0x0164;
    L_0x0051:
        r11 = r2.flags;	 Catch:{ Exception -> 0x0182 }
        r11 = r11 & 4;
        if (r11 != 0) goto L_0x0164;
    L_0x0057:
        r11 = r9.k;	 Catch:{ Exception -> 0x0182 }
        if (r11 != 0) goto L_0x00ca;
    L_0x005b:
        r11 = r10.containsKey(r4);	 Catch:{ Exception -> 0x0182 }
        if (r11 == 0) goto L_0x00c2;
    L_0x0061:
        r11 = r10.containsKey(r3);	 Catch:{ Exception -> 0x0182 }
        if (r11 == 0) goto L_0x00c2;
    L_0x0067:
        r11 = r10.getByteBuffer(r4);	 Catch:{ Exception -> 0x0182 }
        r3 = r10.getByteBuffer(r3);	 Catch:{ Exception -> 0x0182 }
        r17 = defpackage.acjf.a(r13, r12, r12);	 Catch:{ Exception -> 0x0182 }
        r9.a(r11);	 Catch:{ Exception -> 0x0182 }
        r9.a(r3);	 Catch:{ Exception -> 0x0182 }
        r11 = defpackage.acjf.a(r11, r3);	 Catch:{ Exception -> 0x0182 }
        r3 = 6;
        r18 = 9;
        r19 = 0;
        r10 = r9;
        r12 = r17;
        r20 = r13;
        r13 = r3;
        r3 = r14;
        r14 = r18;
        r21 = r15;
        r15 = r19;
        r10.a(r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0182 }
        r10 = r3.containsKey(r4);	 Catch:{ Exception -> 0x0182 }
        if (r10 == 0) goto L_0x00ba;
    L_0x0098:
        r11 = r3.getByteBuffer(r4);	 Catch:{ Exception -> 0x0182 }
        r3 = new android.media.MediaCodec$BufferInfo;	 Catch:{ Exception -> 0x0182 }
        r3.<init>();	 Catch:{ Exception -> 0x0182 }
        r4 = r11.limit();	 Catch:{ Exception -> 0x0182 }
        r3.size = r4;	 Catch:{ Exception -> 0x0182 }
        r11.position(r7);	 Catch:{ Exception -> 0x0182 }
        r3 = r21;
        r4 = 1;
        r12 = defpackage.acjf.a(r3, r4);	 Catch:{ Exception -> 0x0182 }
        r13 = 4;
        r14 = 8;
        r15 = 0;
        r10 = r9;
        r10.a(r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0182 }
        goto L_0x00ce;
    L_0x00ba:
        r0 = new java.net.ProtocolException;	 Catch:{ Exception -> 0x0182 }
        r2 = "Audio format missing codec config data";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0182 }
        throw r0;	 Catch:{ Exception -> 0x0182 }
    L_0x00c2:
        r0 = new java.net.ProtocolException;	 Catch:{ Exception -> 0x0182 }
        r2 = "Video format missing codec config data";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0182 }
        throw r0;	 Catch:{ Exception -> 0x0182 }
    L_0x00ca:
        r20 = r13;
        r3 = r15;
        r4 = 1;
    L_0x00ce:
        r10 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ Exception -> 0x0182 }
        r11 = r2.presentationTimeUs;	 Catch:{ Exception -> 0x0182 }
        r10 = r10.toMillis(r11);	 Catch:{ Exception -> 0x0182 }
        r12 = r9.d;	 Catch:{ Exception -> 0x0182 }
        r12.a(r10);	 Catch:{ Exception -> 0x0182 }
        r9.j = r7;	 Catch:{ Exception -> 0x0182 }
        goto L_0x00e2;
    L_0x00de:
        r20 = r13;
        r3 = r15;
        r4 = 1;
    L_0x00e2:
        if (r0 != r8) goto L_0x00ed;
    L_0x00e4:
        r3 = defpackage.acjf.a(r3, r7);	 Catch:{ Exception -> 0x0182 }
        r10 = 8;
        r12 = r3;
        r13 = 4;
        goto L_0x0104;
    L_0x00ed:
        r3 = r2.flags;	 Catch:{ Exception -> 0x0182 }
        r3 = r3 & r4;
        if (r3 != 0) goto L_0x00f6;
    L_0x00f2:
        r3 = r20;
        r10 = 0;
        goto L_0x00f9;
    L_0x00f6:
        r3 = r20;
        r10 = 1;
    L_0x00f9:
        r3 = defpackage.acjf.a(r3, r7, r10);	 Catch:{ Exception -> 0x0182 }
        r10 = 6;
        r11 = 9;
        r12 = r3;
        r10 = 9;
        r13 = 6;
    L_0x0104:
        r3 = r9.k;	 Catch:{ Exception -> 0x0182 }
        if (r3 != 0) goto L_0x010a;
    L_0x0108:
        r14 = r10;
        goto L_0x010e;
    L_0x010a:
        r3 = 42;
        r14 = 42;
    L_0x010e:
        r3 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ Exception -> 0x0182 }
        r10 = r2.presentationTimeUs;	 Catch:{ Exception -> 0x0182 }
        r10 = r3.toMillis(r10);	 Catch:{ Exception -> 0x0182 }
        r3 = r9.d;	 Catch:{ Exception -> 0x0182 }
        r15 = r3.b(r10);	 Catch:{ Exception -> 0x0182 }
        if (r15 < 0) goto L_0x012a;
    L_0x011e:
        r3 = r24;
        r9.a(r3);	 Catch:{ Exception -> 0x0182 }
        r10 = r9;
        r11 = r24;
        r10.a(r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0182 }
        goto L_0x0165;
    L_0x012a:
        if (r0 != r8) goto L_0x012f;
    L_0x012c:
        r0 = "AUDIO";
        goto L_0x0131;
    L_0x012f:
        r0 = "VIDEO";
    L_0x0131:
        r3 = r9.d;	 Catch:{ Exception -> 0x0182 }
        r8 = r3.a();	 Catch:{ Exception -> 0x0182 }
        r3 = r0.length();	 Catch:{ Exception -> 0x0182 }
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0182 }
        r3 = r3 + 111;
        r12.<init>(r3);	 Catch:{ Exception -> 0x0182 }
        r3 = "Skipping media data with early timestamp: type=";
        r12.append(r3);	 Catch:{ Exception -> 0x0182 }
        r12.append(r0);	 Catch:{ Exception -> 0x0182 }
        r0 = ", timestamp=";
        r12.append(r0);	 Catch:{ Exception -> 0x0182 }
        r12.append(r10);	 Catch:{ Exception -> 0x0182 }
        r0 = ", startTime=";
        r12.append(r0);	 Catch:{ Exception -> 0x0182 }
        r12.append(r8);	 Catch:{ Exception -> 0x0182 }
        r0 = "RtmpOutputStream";
        r3 = r12.toString();	 Catch:{ Exception -> 0x0182 }
        android.util.Log.e(r0, r3);	 Catch:{ Exception -> 0x0182 }
        goto L_0x0165;
    L_0x0164:
        r4 = 1;
    L_0x0165:
        r0 = r5.g;	 Catch:{ Exception -> 0x0182 }
        if (r0 == 0) goto L_0x016e;
    L_0x0169:
        r0 = r5.f;	 Catch:{ Exception -> 0x0182 }
        r0.b();	 Catch:{ Exception -> 0x0182 }
    L_0x016e:
        r8 = r1.n;	 Catch:{ Exception -> 0x0182 }
        r0 = r2.size;	 Catch:{ Exception -> 0x0182 }
        r2 = r2.offset;	 Catch:{ Exception -> 0x0182 }
        r0 = r0 - r2;
        r2 = (long) r0;	 Catch:{ Exception -> 0x0182 }
        r8 = r8 + r2;
        r1.n = r8;	 Catch:{ Exception -> 0x0182 }
        return r4;
    L_0x017a:
        r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x0182 }
        r2 = "RTMP stream must be published before sending data";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0182 }
        throw r0;	 Catch:{ Exception -> 0x0182 }
    L_0x0182:
        r0 = move-exception;
        r2 = "Sending sample data failed";
        android.util.Log.e(r6, r2, r0);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acje.a(int, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):boolean");
    }

    public final void a(Context context, acht acht) {
        acht.a(this.d);
    }

    public final long j() {
        return this.n;
    }

    public final int g() {
        return this.a.c();
    }

    public final Pair h() {
        return this.a.d();
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void k() {
        achq achq = this.m;
        if (achq != null) {
            achq.a();
        }
    }
}
