package com.tgame.advfluxtools.multiblocks.energy;

import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyStorage;
import com.tgame.mods.libs.multiblocks.MultiblockValidationException;
import com.tgame.mods.libs.multiblocks.grid.GridController;
import com.tgame.mods.libs.multiblocks.simpleimpl.TileSimpleNode;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * @since 24/05/14
 * @author tgame14
 */
public class TileEnergyMultiblock extends TileSimpleNode implements IEnergyHandler
{
    @Override
    public GridController createNewMultiblock ()
    {
        return new RFGridController(getWorldObj());
    }

    @Override
    public Class<? extends GridController> getMultiblockControllerType ()
    {
        return RFGridController.class;
    }

    @Override
    public void isGoodForFrame () throws MultiblockValidationException
    {

    }

    @Override
    public void isGoodForSides () throws MultiblockValidationException
    {

    }

    @Override
    public void isGoodForTop () throws MultiblockValidationException
    {

    }

    @Override
    public void isGoodForBottom () throws MultiblockValidationException
    {

    }

    @Override
    public void isGoodForInterior () throws MultiblockValidationException
    {

    }

    @Override
    public void onMachineActivated ()
    {

    }

    @Override
    public void onMachineDeactivated ()
    {

    }

    public IEnergyStorage getInternalEnergy()
    {
        return (IEnergyStorage) this.getMultiblockController();
    }

    @Override
    public boolean canConnectEnergy (ForgeDirection from)
    {
        return true;
    }

    @Override
    public int receiveEnergy (ForgeDirection from, int maxReceive, boolean simulate)
    {
        return getInternalEnergy().receiveEnergy(maxReceive, simulate);
    }

    @Override
    public int extractEnergy (ForgeDirection from, int maxExtract, boolean simulate)
    {
        return getInternalEnergy().extractEnergy(maxExtract, simulate);
    }

    @Override
    public int getEnergyStored (ForgeDirection from)
    {
        return getInternalEnergy().getEnergyStored();
    }

    @Override
    public int getMaxEnergyStored (ForgeDirection from)
    {
        return getInternalEnergy().getMaxEnergyStored();
    }
}
