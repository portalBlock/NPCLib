package com.topcat.npclib.nms;

import net.minecraft.server.v1_7_R4.EntityPlayer;
import net.minecraft.server.v1_7_R4.Packet;
import net.minecraft.server.v1_7_R4.PacketPlayInWindowClick;
import net.minecraft.server.v1_7_R4.PacketPlayInTransaction;
import net.minecraft.server.v1_7_R4.PacketPlayInFlying;
import net.minecraft.server.v1_7_R4.PacketPlayInUpdateSign;
import net.minecraft.server.v1_7_R4.PacketPlayInBlockDig;
import net.minecraft.server.v1_7_R4.PacketPlayInBlockPlace;
import net.minecraft.server.v1_7_R4.Packet16BlockItemSwitch;
import net.minecraft.server.v1_7_R4.PacketPlayInArmAnimation;
import net.minecraft.server.v1_7_R4.PacketPlayInEntityAction;
import net.minecraft.server.v1_7_R4.Packet255KickDisconnect;
import net.minecraft.server.v1_7_R4.PacketPlayInChat;
import net.minecraft.server.v1_7_R4.PacketPlayInUseEntity;
import net.minecraft.server.v1_7_R4.PacketPlayInClientCommand;
import net.minecraft.server.v1_7_R4.PlayerConnection;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_7_R4.CraftServer;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;

import com.topcat.npclib.NPCManager;

/**
 * 
 * @author martin
 */
public class NPCPlayerConnection extends PlayerConnection {

    public NPCPlayerConnection(NPCManager npcManager, EntityPlayer entityplayer) {
        super(npcManager.getServer().getMCServer(), npcManager.getNPCNetworkManager(), entityplayer);
    }

    @Override
    public CraftPlayer getPlayer() {
        return new CraftPlayer((CraftServer) Bukkit.getServer(), player); // Fake player prevents spout NPEs
    }

    @Override
    public void a(PacketPlayInFlying packet10flying) {
    }

    @Override
    public void a(double d0, double d1, double d2, float f, float f1) {
    }

    @Override
    public void a(PacketPlayInBlockDig packet14blockdig) {
    }

    @Override
    public void a(PacketPlayInBlockPlace packet15place) {
    }

    @Override
    public void a(Packet16BlockItemSwitch packet16blockitemswitch) {
    }

    @Override
    public void a(PacketPlayInChat packet3chat) {
    }

    @Override
    public void a(PacketPlayInArmAnimation packet18armanimation) {
    }

    @Override
    public void a(PacketPlayInEntityAction packet19entityaction) {
    }

    @Override
    public void a(Packet255KickDisconnect packet255kickdisconnect) {
    }

    @Override
    public void sendPacket(Packet packet) {
    }

    @Override
    public void a(PacketPlayInUseEntity packet7useentity) {
    }

    @Override
    public void a(PacketPlayInClientCommand packetPlayInClientCommand) {
    }

    @Override
    public void a(PacketPlayInWindowClick packet102windowclick) {
    }

    @Override
    public void a(PacketPlayInTransaction packet106transaction) {
    }

    @Override
    public void a(PacketPlayInUpdateSign packet130updatesign) {
    }

}