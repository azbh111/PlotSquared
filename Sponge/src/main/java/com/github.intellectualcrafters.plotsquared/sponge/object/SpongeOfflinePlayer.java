package com.github.intellectualcrafters.plotsquared.sponge.object;

import com.github.intellectualcrafters.plotsquared.plot.object.OfflinePlotPlayer;
import java.util.UUID;
import org.spongepowered.api.entity.living.player.User;

public class SpongeOfflinePlayer implements OfflinePlotPlayer {

  private User user;

  public SpongeOfflinePlayer(User user) {
    this.user = user;
  }

  @Override
  public UUID getUUID() {
    return user.getUniqueId();
  }

  @Override
  public long getLastPlayed() {
    return 0; //todo
  }

  @Override
  public boolean isOnline() {
    return user.isOnline();
  }

  @Override
  public String getName() {
    return user.getName();
  }
}