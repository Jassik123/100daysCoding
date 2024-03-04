const{User}=require("../models/User")

const isEmailExists=async(req,res,next)=>{
    const{name,email,password,cpassword}=req.body;
    let users=await User.find({email})
    if(users.length>0){
        return res.send("email already exist")
    }
    next();
}
module.exports={isEmailExists};