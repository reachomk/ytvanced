package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

@Deprecated
/* renamed from: nly */
public final class nly implements nnd, nne {
    private final Context a;
    private final Uri b;
    private IOException c;
    private MediaExtractor d;
    private nmx[] e;
    private boolean f;
    private int g;
    private int[] h;
    private boolean[] i;
    private long j;
    private long k;

    public nly(Context context, Uri uri) {
        nwf.b(nxf.a >= 16);
        this.a = (Context) nwf.a((Object) context);
        this.b = (Uri) nwf.a((Object) uri);
    }

    public final boolean b(int i, long j) {
        return true;
    }

    public final nnd aP_() {
        this.g++;
        return this;
    }

    public final boolean b() {
        if (!this.f) {
            if (this.c == null) {
                this.d = new MediaExtractor();
                try {
                    Context context = this.a;
                    Map map = null;
                    if (context != null) {
                        this.d.setDataSource(context, this.b, null);
                    } else {
                        this.d.setDataSource(null, 0, 0);
                    }
                    this.h = new int[this.d.getTrackCount()];
                    int length = this.h.length;
                    this.i = new boolean[length];
                    this.e = new nmx[length];
                    length = 0;
                    while (length < this.h.length) {
                        nmx[] nmxArr = this.e;
                        MediaFormat trackFormat = this.d.getTrackFormat(length);
                        String string = trackFormat.getString("mime");
                        String str = "language";
                        String string2 = trackFormat.containsKey(str) ? trackFormat.getString(str) : map;
                        int a = nly.a(trackFormat, "max-input-size");
                        int a2 = nly.a(trackFormat, "width");
                        int a3 = nly.a(trackFormat, "height");
                        int a4 = nly.a(trackFormat, "rotation-degrees");
                        int a5 = nly.a(trackFormat, "channel-count");
                        int a6 = nly.a(trackFormat, "sample-rate");
                        int a7 = nly.a(trackFormat, "encoder-delay");
                        int a8 = nly.a(trackFormat, "encoder-padding");
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        while (true) {
                            StringBuilder stringBuilder = new StringBuilder(15);
                            String str2 = "csd-";
                            stringBuilder.append(str2);
                            stringBuilder.append(i);
                            if (!trackFormat.containsKey(stringBuilder.toString())) {
                                break;
                            }
                            stringBuilder = new StringBuilder(15);
                            stringBuilder.append(str2);
                            stringBuilder.append(i);
                            ByteBuffer byteBuffer = trackFormat.getByteBuffer(stringBuilder.toString());
                            byte[] bArr = new byte[byteBuffer.limit()];
                            byteBuffer.get(bArr);
                            arrayList.add(bArr);
                            byteBuffer.flip();
                            i++;
                        }
                        String str3 = "durationUs";
                        nmx nmx = r8;
                        nmx nmx2 = new nmx(null, string, -1, a, trackFormat.containsKey(str3) ? trackFormat.getLong(str3) : -1, a2, a3, a4, -1.0f, a5, a6, string2, Long.MAX_VALUE, arrayList, false, -1, -1, !"audio/raw".equals(string) ? -1 : 2, a7, a8, null, -1, null);
                        nmx.x = trackFormat;
                        nmxArr[length] = nmx;
                        length++;
                        map = null;
                    }
                    this.f = true;
                } catch (IOException e) {
                    this.c = e;
                }
            }
            return false;
        }
        return true;
    }

    public final int c() {
        nwf.b(this.f);
        return this.h.length;
    }

    public final nmx a(int i) {
        nwf.b(this.f);
        return this.e[i];
    }

    public final void a(int i, long j) {
        nwf.b(this.f);
        boolean z = false;
        nwf.b(this.h[i] == 0);
        this.h[i] = 1;
        this.d.selectTrack(i);
        if (j != 0) {
            z = true;
        }
        a(j, z);
    }

    public final long b(int i) {
        boolean[] zArr = this.i;
        if (!zArr[i]) {
            return Long.MIN_VALUE;
        }
        zArr[i] = false;
        return this.j;
    }

    public final int a(int i, long j, nmz nmz, nnb nnb) {
        nwf.b(this.f);
        nwf.b(this.h[i] != 0);
        if (!this.i[i]) {
            if (this.h[i] != 2) {
                nmz.a = this.e[i];
                npv npv = null;
                if (nxf.a >= 18) {
                    Map psshInfo = this.d.getPsshInfo();
                    if (!(psshInfo == null || psshInfo.isEmpty())) {
                        npv = new npy();
                        for (UUID uuid : psshInfo.keySet()) {
                            byte[] bArr = (byte[]) psshInfo.get(uuid);
                            int length = bArr.length;
                            int i2 = length + 32;
                            ByteBuffer allocate = ByteBuffer.allocate(i2);
                            allocate.putInt(i2);
                            allocate.putInt(nsg.X);
                            allocate.putInt(0);
                            allocate.putLong(uuid.getMostSignificantBits());
                            allocate.putLong(uuid.getLeastSignificantBits());
                            allocate.putInt(length);
                            allocate.put(bArr);
                            npv.a(uuid, new npx("video/mp4", allocate.array()));
                        }
                    }
                }
                nmz.b = npv;
                this.h[i] = 2;
                return -4;
            }
            int sampleTrackIndex = this.d.getSampleTrackIndex();
            if (sampleTrackIndex == i) {
                ByteBuffer byteBuffer = nnb.b;
                if (byteBuffer != null) {
                    i = byteBuffer.position();
                    sampleTrackIndex = this.d.readSampleData(nnb.b, i);
                    nnb.c = sampleTrackIndex;
                    nnb.b.position(i + sampleTrackIndex);
                } else {
                    nnb.c = 0;
                }
                nnb.e = this.d.getSampleTime();
                nnb.d = this.d.getSampleFlags() & 3;
                if (nnb.a()) {
                    nll nll = nnb.a;
                    this.d.getSampleCryptoInfo(nll.g);
                    nll.f = nll.g.numSubSamples;
                    nll.d = nll.g.numBytesOfClearData;
                    nll.e = nll.g.numBytesOfEncryptedData;
                    nll.b = nll.g.key;
                    nll.a = nll.g.iv;
                    nll.c = nll.g.mode;
                }
                this.k = -1;
                this.d.advance();
                return -3;
            } else if (sampleTrackIndex < 0) {
                return -1;
            }
        }
        return -2;
    }

    public final void c(int i) {
        nwf.b(this.f);
        nwf.b(this.h[i] != 0);
        this.d.unselectTrack(i);
        this.i[i] = false;
        this.h[i] = 0;
    }

    public final void d() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void a(long j) {
        nwf.b(this.f);
        a(j, false);
    }

    public final long e() {
        nwf.b(this.f);
        long cachedDuration = this.d.getCachedDuration();
        if (cachedDuration == -1) {
            return -1;
        }
        long sampleTime = this.d.getSampleTime();
        return sampleTime != -1 ? sampleTime + cachedDuration : -3;
    }

    public final void f() {
        nwf.b(this.g > 0);
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            MediaExtractor mediaExtractor = this.d;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.d = null;
            }
        }
    }

    private final void a(long j, boolean z) {
        if (z || this.k != j) {
            this.j = j;
            this.k = j;
            int i = 0;
            this.d.seekTo(j, 0);
            while (true) {
                int[] iArr = this.h;
                if (i < iArr.length) {
                    if (iArr[i] != 0) {
                        this.i[i] = true;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static final int a(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : -1;
    }
}
