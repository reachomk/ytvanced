package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        return totalTxBytes == -1 ? 0 : totalTxBytes;
    }

    private static long getTotalRxBytes() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        return totalRxBytes == -1 ? 0 : totalRxBytes;
    }

    private static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        return uidTxBytes == -1 ? 0 : uidTxBytes;
    }

    private static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        return uidRxBytes == -1 ? 0 : uidRxBytes;
    }
}
