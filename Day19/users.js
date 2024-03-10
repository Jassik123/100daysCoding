import express from "express";
import {getUser,  update,   deleteUser} from "../controllers/user.js";
import { verifyToken } from "../verifyToken.js";
const router = express.Router();

router.put("/:id", verifyToken, update);

router.get('/find/:id', getUser);

router.delete("/:id", verifyToken, deleteUser);
export default router; 