package defpackage;

import android.media.AudioRecord;

/* renamed from: iyw */
public final class iyw {
    private static final int[] a = new int[]{16000, 22050, 24000};
    private static final short[] b = new short[]{(short) 2};
    private static final short[] c = new short[]{(short) 16};
    private AudioRecord d;

    public final AudioRecord a() {
        Exception e;
        if (this.d == null) {
            loop0:
            for (int i : a) {
                for (int i2 : b) {
                    short[] sArr = c;
                    int length = sArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        short s = sArr[i3];
                        int i22;
                        int i4;
                        int i5;
                        short[] sArr2;
                        int i6;
                        try {
                            int minBufferSize = AudioRecord.getMinBufferSize(i, s, i22);
                            if (minBufferSize == -2 || minBufferSize == -1) {
                                i4 = i3;
                                i5 = length;
                                sArr2 = sArr;
                                i6 = i22;
                                i3 = i4 + 1;
                                length = i5;
                                sArr = sArr2;
                                i22 = i6;
                            } else {
                                int max = Math.max(1280, minBufferSize);
                                AudioRecord audioRecord = audioRecord;
                                i4 = i3;
                                i5 = length;
                                sArr2 = sArr;
                                i6 = i22;
                                try {
                                    audioRecord = new AudioRecord(6, i, s, i22, max);
                                    if (audioRecord.getState() == 1) {
                                        break loop0;
                                    }
                                    audioRecord.release();
                                    i3 = i4 + 1;
                                    length = i5;
                                    sArr = sArr2;
                                    i22 = i6;
                                } catch (Exception e2) {
                                    e = e2;
                                    xtl.a("Could not initialize AudioRecord: ", e.getMessage());
                                    i3 = i4 + 1;
                                    length = i5;
                                    sArr = sArr2;
                                    i22 = i6;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i4 = i3;
                            i5 = length;
                            sArr2 = sArr;
                            i6 = i22;
                            xtl.a("Could not initialize AudioRecord: ", e.getMessage());
                            i3 = i4 + 1;
                            length = i5;
                            sArr = sArr2;
                            i22 = i6;
                        }
                    }
                }
            }
            AudioRecord audioRecord2 = null;
            this.d = audioRecord2;
        }
        return this.d;
    }
}
